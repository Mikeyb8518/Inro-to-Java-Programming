import java.util.Scanner;

public class gradeToNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");

        String userInput = input.nextLine();

        userInput = userInput.toUpperCase();

        switch (userInput) {
            case "A": System.out.println("The numeric value for grade " + userInput + " is 4");
                break;
            case "B": System.out.println("The numeric value for grade " + userInput + " is 3");
                break;
            case "C": System.out.println("The numeric value for grade " + userInput + " is 2");
                break;
            case "D": System.out.println("The numeric value for grade " + userInput + " is 1");
                break;
            case "F": System.out.println("The numeric value for grade " + userInput + " is 0");

            default: System.out.println(userInput + " is an invalid grade");
                System.exit(1);
        }
    }
}
