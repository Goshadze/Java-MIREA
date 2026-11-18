package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class InheritedGenericStack<E> extends ArrayList<E> {
    public int getSize() { return size(); }
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return get(size() - 1);
    }
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return remove(size() - 1);
    }
    public void push(E value) { add(value); }
}
