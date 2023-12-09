public class ExecuteQueue {
    public static void main(String[] args) {
        // Create a queue object
        Queue queue = new Queue();

        // Add 20 numbers from 1-20
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Remove numbers and display them
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
