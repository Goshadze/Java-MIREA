package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() { return list.isEmpty(); }
    public int getSize() { return list.size(); }
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.get(getSize() - 1);
    }
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.remove(getSize() - 1);
    }
    public void push(Object value) { list.add(value); }

    @Override
    public MyStack clone() {
        try {
            MyStack copy = (MyStack) super.clone();
            copy.list = new ArrayList<>(list);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() { return "Стек: " + list; }
}
