import java.util.Scanner;

public class perimiterTriangle {
    public static void main(String[] args) {
        System.out.print("Please Enter the Three Edges of a Triangle Separated by Spaces: ");
        Scanner input = new Scanner(System.in);

        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if (s3 > (s1 + s2) || s2 > (s1 + s3) || s1 > (s2 + s3)) {
            System.out.println("Invalid input");
        } else {
            System.out.println("The perimeter of the triangle is " + (s1 + s2 + s3));
        }
    }
}
