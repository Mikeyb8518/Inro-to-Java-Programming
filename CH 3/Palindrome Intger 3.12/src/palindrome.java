import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System print to ask the user to enter a three digit integer
        System.out.print("Enter a three-digit integer: ");
        // Variable num to hold user input
        int num = input.nextInt();
        // Variable reverseNumber set to 0
        int reverseNumber = 0;
        // Variable temp is equal to num
        int temp = num;

        // While loop to check if user input is a palindrome
        while (temp > 0) {
            int remainder = temp % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            temp = temp / 10;
        }
        // If statement to see if num is equal to reverse and print result
        if (num == reverseNumber) {
            System.out.println(num + " is a palindrome number");
        }
        else {
            System.out.println(num + " is not palindrome number");
        }
    }
}
