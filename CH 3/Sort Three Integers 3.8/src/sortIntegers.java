import java.util.Scanner;

public class sortIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2) {
            int temp1 = num1;
            num1 = num2;
            num2 = temp1;
        }
        if (num2 > num3) {
            int temp2 = num2;
            num2 = num3;
            num3 = temp2;
        }
        if (num3 > num1) {
            int temp3 = num3;
            num3 = num1;
            num1 = temp3;
        }

        System.out.println(num1 + " " +  num2 + " " + num3);
    }
}
