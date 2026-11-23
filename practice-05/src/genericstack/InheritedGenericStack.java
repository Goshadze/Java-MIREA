package genericstack;

import java.util.ArrayList;

public class InheritedGenericStack<E> extends ArrayList<E> {

    public int getSize() {
        return size();
    }

    public E peek() {
        return get(getSize() - 1);
    }

    public E pop() {
        E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push(E o) {
        add(o);
    }
}
