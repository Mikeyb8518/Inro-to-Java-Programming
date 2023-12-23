import java.util.Scanner;

public class Execute11_01 {
    // Main method
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Asks user to enter three sides
        System.out.print("Enter three sides of Triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Asks user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();

        // Asks user if the triangle is filled(true or false)
        System.out.print("Is the Triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create Triangle object with user data
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is:" + (triangle.isFilled() ? "" : " not")
                + " filled");
    }
}
