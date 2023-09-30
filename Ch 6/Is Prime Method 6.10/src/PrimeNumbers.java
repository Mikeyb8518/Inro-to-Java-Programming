public class PrimeNumbers {
    public static void main(String[] args) {
        int numberOfPrimes = 0;

        for (int i = 1; i < 10000; i++) {
            if (PrimeNumbers.isPrime(i)) {
                numberOfPrimes++;
            }
        }

        System.out.println("The number of primes for less than 10000 are: " + numberOfPrimes);
    }

    /*public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d", number);
            }

            number++;
        }
    }*/

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
