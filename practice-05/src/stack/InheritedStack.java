package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class InheritedStack extends ArrayList<Object> {
    public int getSize() { return size(); }
    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return get(getSize() - 1);
    }
    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return remove(getSize() - 1);
    }
    public void push(Object value) { add(value); }

    @Override
    public InheritedStack clone() { return (InheritedStack) super.clone(); }
}
