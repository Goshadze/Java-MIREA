import stack.MyStack;
import stack.InheritedStack;
import stack.GenericStack;
import stack.InheritedGenericStack;
import stack.Algorithms;
import stack.Circle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class StackTest {
    public static void main(String[] args) {
        MyStack original = new MyStack();
        assert original.isEmpty() && original.getSize() == 0;
        try { original.pop(); throw new AssertionError("Пустой стек"); }
        catch (EmptyStackException expected) { }
        original.push("один");
        original.push("два");
        assert original.peek().equals("два") && original.getSize() == 2;
        MyStack copy = original.clone();
        assert copy != original && copy.pop().equals("два");
        copy.push("три");
        assert original.peek().equals("два") && copy.peek().equals("три");
        assert original.pop().equals("два") && original.pop().equals("один") && original.isEmpty();

        InheritedStack inherited = new InheritedStack();
        inherited.push("один");
        inherited.push("два");
        assert inherited.peek().equals("два") && inherited.getSize() == 2;
        InheritedStack inheritedCopy = inherited.clone();
        assert inheritedCopy.pop().equals("два") && inherited.getSize() == 2;
        assert inherited.pop().equals("два") && inherited.pop().equals("один");
        try { inherited.peek(); throw new AssertionError("Пустой стек"); }
        catch (EmptyStackException expected) { }
        GenericStack<Integer> arrayStack = new GenericStack<>();
        for (int i = 0; i < 20; i++) arrayStack.push(i);
        for (int i = 19; i >= 0; i--) assert arrayStack.pop() == i;
        assert arrayStack.isEmpty();
        try { arrayStack.peek(); throw new AssertionError("Пустой стек"); }
        catch (EmptyStackException expected) { }
        InheritedGenericStack<String> generic = new InheritedGenericStack<>();
        generic.push("тест");
        assert generic.peek().equals("тест") && generic.pop().equals("тест") && generic.isEmpty();
        assert Algorithms.unique(new ArrayList<>(Arrays.asList(1, 2, 1, null, null))).equals(Arrays.asList(1, 2, null));
        assert Algorithms.linearSearch(new Integer[]{3, 5, 7}, 5) == 1;
        assert Algorithms.linearSearch(new Integer[]{3, 5, 7}, 8) == -1;
        assert Algorithms.max(new Circle[]{new Circle(1), new Circle(3)}).getRadius() == 3;
        assert Algorithms.max(new Integer[][]{{-10, -2}, {}, {-5}}) == -2;
        try { Algorithms.max(new Integer[][]{{}, {}}); throw new AssertionError("Пустая матрица"); }
        catch (IllegalArgumentException expected) { }
        System.out.println("Все проверки стека и алгоритмов пройдены.");
    }
}
