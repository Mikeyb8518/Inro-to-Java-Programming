import java.util.ArrayList;

public class Stack {
    private java.util.ArrayList<Object> list;
    // Create a default stack class
    public Stack() {
        list = new java.util.ArrayList<Object>();
    }

    // Add to the top of the list
    public void push(Object o) {
        list.add(0, o);
    }

    // Return element to the stack without removing it
    public Object peek() {
        return list.get(0);
    }
    // Return a moved element to the top of the stack
    public Object pop() {
        Object o = list.get(0);
        list.remove(0);
        return o;
    }
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
