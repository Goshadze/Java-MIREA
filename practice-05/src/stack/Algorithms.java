package stack;

import java.util.ArrayList;
import java.util.Objects;

public class Algorithms {
    public static <E> ArrayList<E> unique(ArrayList<E> values) {
        ArrayList<E> result = new ArrayList<>();
        for (E value : values) if (!result.contains(value)) result.add(value);
        return result;
    }
    public static <E> int linearSearch(E[] values, E target) {
        for (int i = 0; i < values.length; i++) if (Objects.equals(values[i], target)) return i;
        return -1;
    }
    public static <E extends Comparable<? super E>> E max(E[] values) {
        if (values.length == 0) throw new IllegalArgumentException("Пустой массив");
        E result = values[0];
        for (E value : values) if (value.compareTo(result) > 0) result = value;
        return result;
    }
    public static <E extends Comparable<? super E>> E max(E[][] values) {
        E result = null;
        for (E[] row : values) for (E value : row)
            if (result == null || value.compareTo(result) > 0) result = value;
        if (result == null) throw new IllegalArgumentException("Пустой массив");
        return result;
    }
}
