package generics;

import java.util.ArrayList;

public class Algorithms {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <E> int linearSearch(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (key.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> E max(E[] array) {
        E result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }

    public static <E extends Comparable<E>> E max(E[][] array) {
        E result = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].compareTo(result) > 0) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }
}
