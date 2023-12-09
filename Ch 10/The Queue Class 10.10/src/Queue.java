public class Queue {
    // Data Fields
    private int[] elements;
    private int size;
    public final int DEFAULT_CAPACITY = 8;

    // Default Constructor
    Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    // enqueue method that adds v into the queue
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    // dequeue method removes and returns the elements from the queue
    public int dequeue() {
        int v = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        size--;
        return v;
    }

    // empty method returns true if it is empty
    public boolean empty() {
        return size ==  0;
    }

    // getSize method returns the size of the queue
    public int getSize() {
        return size;
    }
}
