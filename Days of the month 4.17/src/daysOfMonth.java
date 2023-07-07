import java.util.Scanner;

public class daysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");

        int year = input.nextInt();

        System.out.print("Enter a Month (must start with capital): ");

        String userInput = input.next();

        switch (userInput) {
            case "Jan": System.out.println(userInput + " " + year + " has 31 days");
                break;
            case "Feb": System.out.println(userInput + " " + year + " has 28 days");
                break;
            case "Mar": System.out.println(userInput + " " + year + " has 31 days");
                break;
            case "Apr": System.out.println(userInput + " " + year + " has 30 days");
                break;
            case "May": System.out.println(userInput + " " + year + " has 31 days");
                break;
            case "Jun": System.out.println(userInput + " " + year + " has 30 days");
                break;
            case "Jul": System.out.println(userInput + " " + year + " has 31 days");
                break;
            case "Aug": System.out.println(userInput + " " + year + " has 31 days");
                break;
            case "Sep": System.out.println(userInput + " " + year + " has 30 days");
                break;
            case "Oct": System.out.println(userInput + " " + year + " has 31 days");
                break;
            case "Nov": System.out.println(userInput + " " + year + " has 30 days");
                break;
            case "Dec": System.out.println(userInput + " " + year + " has 31 days");
                break;
            default: System.out.println(userInput + " is not a correct month name");
                System.exit(1);
        }
    }
}
