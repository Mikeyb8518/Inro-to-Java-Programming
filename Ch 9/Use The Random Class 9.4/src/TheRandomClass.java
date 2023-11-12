import java.util.Random;

public class TheRandomClass {
    public static void main(String[] args) {
        // Creates a random object
        java.util.Random random = new Random(1000);

        // for loop to display 50 random integers between 0 and 100
        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0) {
                System.out.printf("%5d\n", random.nextInt(100));
            }
            else {
                System.out.printf("%5d", random.nextInt(100));
            }
        }
    }
}
