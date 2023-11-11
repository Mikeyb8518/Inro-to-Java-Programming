import java.text.DecimalFormat;

public class Execute {
    public static void main(String[] args) {
        // decimal format to show two places
        DecimalFormat df = new DecimalFormat("0.00");

        // Creates a Rectangle with width 4 and height 40
        Rectangle rectangle1 = new Rectangle(4, 40);
        // Creates a Rectangle with width 3.5 and height 35.9
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Displays the width, height, area, perimeter of rectangle1
        System.out.println("\n Rectangle1");
        System.out.println("----------------");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        // Displays the width, height, area, perimeter of rectangle2
        System.out.println("\n Rectangle2");
        System.out.println("----------------");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + df.format(rectangle2.getArea()));
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
