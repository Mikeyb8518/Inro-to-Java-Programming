import java.util.Scanner;

public class ATMGame {
    public static void main(String[] args) {
        // Create a scanner input
        Scanner input = new Scanner(System.in);

        // Create 10 account in an array
        Account[] accounts = new Account[10];

        // Initialize account with balance of 100
        initialBalance(accounts);

        do {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if(isValidID(id, accounts)) {
                int choice;
                do {
                    choice = displayMenu(input);
                    if (isTransaction(choice)) {
                        executeTransaction(choice, accounts, id, input);
                    }
                }
                while (choice != 4);
            }
        }
        while (true);
    }

    // initialBalance method to set accounts to 100 dollars
    public static void initialBalance(Account[] a) {
        int initialBalance = 100;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Account(i, initialBalance);
        }
    }
    // isTransaction method returns true if choice is a transaction
    public static boolean isTransaction(int choice) {
        return choice > 0 && choice < 4;
    }
    // isValidID method returns true if ID is valid
    public static boolean isValidID(int id, Account[] a) {
        for (int i = 0; i < a.length; i++) {
            if (id == a[i].getId()) {
                return true;
            }
        }
        return false;
    }
    // displayMenu method display user input menu
    public static int displayMenu(Scanner input) {
        System.out.print(
                "\nMain menu\n1: check balance\n2: withdraw" +
                        "\n3: deposit\n4: exit\nEnter a choice: ");
        return input.nextInt();
    }
    // executeTransaction method executes the transaction
    public static void executeTransaction(int c, Account[] a, int id, Scanner input) {
        switch (c) {
            case 1: // view current balance
                System.out.println("Balance is: " + a[id].getBalance());
                break;

            case 2: // Withdraw money
                System.out.println("Enter an amount to withdraw: ");
                a[id].withdraw(input.nextDouble());
                break;

            case 3: // Deposit money
                System.out.println("Enter an amount to deposit: ");
                a[id].deposit(input.nextDouble());
                break;
        }
    }
}
