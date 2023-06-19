import java.util.Scanner;

public class randomPoint {
    public static void main(String[] args) {
        System.out.println("Random point in rectangle, Starting at point (0,0)");

        int width = (int)(Math.random() * 101);
        int height = (int)(Math.random() * 201);

        System.out.println("\nRandom point is: ");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println(height + ", " + width);
    }
}
