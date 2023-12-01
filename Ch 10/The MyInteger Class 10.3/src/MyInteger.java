public class MyInteger {
    // Private value data field
    private int value;

    // Constructor that creates a MyInteger object with specified int value
    MyInteger(int value)  {
        this.value = value;
    }

    // Getter Method
    // getValue method returns value
    public int getValue() {
        return value;
    }
    // isEven method returns if it is even
    public boolean isEven() {
        return isEven(value);
    }

    // isOdd method returns if it is odd
    public boolean isOdd() {
        return isOdd(value);
    }
    // isPrime method returns true if it is prime or false if not prime
    public boolean isPrime() {
        return isPrime(value);
    }
    // Static methods
    // isEven returns true if specified value is even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    // isOdd returns true if specified value is odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }
    // isPrime returns true if specified value is prime false if otherwise
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (divisor == 0) {
                return false;
            }
        }
        return true;
    }
    // Returns true if the specified value is even
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }
    // Returns true if the specified value is odd
    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }
    // Returns true if specified number is prime
    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    // Returns true if the value in this object is equal to the specified object
    public boolean equals(int value) {
        return this.value == value;
    }
    // Returns true if the value in this object is equal to the specified object
    public boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }
    // Converts an array of numeric characters to an int value
    public static int parseInt(char[] chars) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, chars.length) - 1;
                i < chars.length; i++, j /= 10) {
            value += (chars[i] - 48) * j;
        }
        return value;
    }
    // Converts a string into an int value
    public static int parseInt(String str) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, str.length()) - 1;
             i < str.length(); i++, j /= 10) {
            value += (str.charAt(i) - 48) * j;
        }
        return value;
    }
}
