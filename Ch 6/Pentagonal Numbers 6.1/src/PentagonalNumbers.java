public class PentagonalNumbers {
    public static void main(String[] args) {
        final int PENTAGONAL_NUMBERS = 100;
        final int NUM_PER_LINES = 10;

        System.out.println("The first 100 pentagonal numbers are: \n");
        for (int i = 1; i <= PENTAGONAL_NUMBERS; i++) {
            if (i % NUM_PER_LINES == 0) {
                System.out.printf("%7d\n", getPentagonalNumber(i));
            }
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }

    public static int getPentagonalNumber (int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
