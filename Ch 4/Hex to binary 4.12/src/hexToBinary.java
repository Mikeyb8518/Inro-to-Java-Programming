import java.util.Scanner;

public class hexToBinary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");

        String userInput = input.nextLine();

        char ch = userInput.charAt(0);


        switch (userInput) {
            case "0": System.out.println("The binary value is: 0000");
                break;
            case "1": System.out.println("The binary value is: 0001");
                break;
            case "2": System.out.println("The binary value is 0010");
                break;
            case "3": System.out.println("The binary value is 0011");
                break;
            case "4": System.out.println("the binary value is: 0100");
                break;
            case "5": System.out.println("The binary value is: 0101");
                break;
            case "6": System.out.println("The binary value is: 0110");
                break;
            case "7": System.out.println("The binary value is: 0111");
                break;
            case "8": System.out.println("The binary value is: 1000");
                break;
            case "9": System.out.println("The binary value is: 1001");
                break;
            }
        if (ch == 'A' || ch == 'a') {
            System.out.println("The binary value is: 1010");
        } else if (ch == 'B'|| ch == 'b') {
            System.out.println("The binary value is: 1011");
        } else if (ch == 'C' || ch == 'c') {
            System.out.println("The binary value is: 1100");
        } else if (ch == 'D' || ch == 'd') {
            System.out.println("The binary value is: 1101");
        } else if (ch == 'E' || ch == 'e') {
            System.out.println("The binary value is: 1110");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("the binary value is: 1111");
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
}
