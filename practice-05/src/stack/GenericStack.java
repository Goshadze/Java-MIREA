package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {
    private Object[] elements = new Object[2];
    private int size;

    public int getSize() { return size; }
    public boolean isEmpty() { return size == 0; }
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return (E) elements[size - 1];
    }
    public E pop() {
        E value = peek();
        elements[--size] = null;
        return value;
    }
    public void push(E value) {
        if (size == elements.length) elements = Arrays.copyOf(elements, elements.length * 2);
        elements[size++] = value;
    }

    @Override
    public String toString() { return "стек: " + Arrays.toString(Arrays.copyOf(elements, size)); }
}
