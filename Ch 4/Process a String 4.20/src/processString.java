import java.util.Scanner;

public class processString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");

        String userInput = input.nextLine();

        System.out.println("The length of the string is " + userInput.length());
        System.out.println("The first character of the string is " + userInput.charAt(0));
    }
}
