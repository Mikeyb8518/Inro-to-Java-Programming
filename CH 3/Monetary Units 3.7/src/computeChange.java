import java.util.Scanner;

public class computeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of ");

        if (amount < 0.0) {
            System.out.println("You have entered an invalid amount");
            System.exit(1);
        }

        if (numberOfOneDollars == 1) {
            System.out.println(numberOfOneDollars + " Dollar");
        }
        else {
            System.out.println(numberOfOneDollars + " Dollars");
        }
        if (numberOfQuarters == 1) {
            System.out.println(numberOfQuarters + " Quarter");
        }
        else {
            System.out.println(numberOfQuarters + " Quarters");
        }
        if (numberOfDimes == 1) {
            System.out.println(numberOfDimes + " Dime");
        }
        else {
            System.out.println(numberOfDimes + " Dimes");
        }
        if (numberOfNickles == 1) {
            System.out.println(numberOfNickles + " Nickle");
        }
        else {
            System.out.println(numberOfNickles + " Nickles");
        }
        if (numberOfPennies == 1) {
            System.out.println(numberOfPennies + " Penny");
        }
        else {
            System.out.println(numberOfPennies + " Pennies");
        }
    }
}
