public class StackOfIntegers {
    // Data fields
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // A default constructor with default capacity 16
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
    // A stack constructor with the specified capacity
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }
    // Push method to push a new integer to the top
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    // Return and remove the top element from the stack
    public int pop() {
        return elements[--size];
    }
    // Return the top element from the stack
    public int peek() {
        return elements[size - 1];
    }
    // Test weather the stack is empty
    public boolean empty() {
        return size == 0;
    }
    // Return the number of elements in the stack
    public int getSize() {
        return size;
    }
}
