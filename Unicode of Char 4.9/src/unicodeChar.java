import java.util.Scanner;

public class unicodeChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Character: ");

        String userInput = input.nextLine();

        int output = userInput.charAt(0);

        System.out.println("The unicode for the character " + userInput + " is " + output);

    }
}
