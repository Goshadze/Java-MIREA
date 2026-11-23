package genericstack;

import java.util.Arrays;

public class GenericStack<E> {

    private E[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[2];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        return elements[size - 1];
    }

    public E pop() {
        E o = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return o;
    }

    public void push(E o) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = o;
        size++;
    }

    @Override
    public String toString() {
        String result = "стек: [";
        for (int i = 0; i < size; i++) {
            result = result + elements[i];
            if (i < size - 1) {
                result = result + ", ";
            }
        }
        return result + "]";
    }
}
