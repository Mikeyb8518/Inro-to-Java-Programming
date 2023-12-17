import java.math.BigInteger;

public class ExecuteProgram {
    public static void main(String[] args) {
        // Find the first 10 numbers divisible by 5 or 6
        int count = 1;
        BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        // Display print
        System.out.println("The first 10 numbers that are greater than Long.MAX_VALUE" +
                "and divisible by 5 or 6");
        //Display Results
        while (count <= 10) {
            n = n.add(new BigInteger("1"));

            if ((n.remainder(five)).compareTo(zero) == 0 ||
                    (n.remainder(six).compareTo(zero) == 0)) {
                System.out.println(count + ": " + n);
                count++;
            }
        }
    }
}
