import java.util.Scanner;

public class CommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String string1 = input.nextLine();

        System.out.println("Enter the second string: ");
        String string2 = input.nextLine();

        int index = 0;
        String prefix = "";

        while (string1.charAt(index) == string2.charAt(index)) {
            prefix += string1.charAt(index);
            index++;
        }

        if (prefix.length() > 0) {
            System.out.println("The common prefix is " + prefix);
        }
        else {
            System.out.println(string1 + " and " + string2 + " have no common prefix");
        }
    }
}
