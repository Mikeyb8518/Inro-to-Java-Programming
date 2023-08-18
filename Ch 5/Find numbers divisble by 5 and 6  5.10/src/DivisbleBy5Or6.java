public class DivisbleBy5Or6 {
    public static void main(String[] args) {

        System.out.println("\tNumbers divisible by 5 and 6");

        final int NUM_PER_LINE = 10;
        int count = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                count++;

                if (count % NUM_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
