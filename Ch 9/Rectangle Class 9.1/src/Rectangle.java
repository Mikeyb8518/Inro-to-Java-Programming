public class Rectangle {
    double width; // double variable width
    double height; // double variable height

    // A no-arg constructor that creates a default rectangle
    Rectangle() {
        width = 1;
        height = 1;
    }
    // A constructor that creates a rectangle with specified width and height
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    // getArea method that returns the area of a rectangle
    double getArea() {
        return width * height;
    }
    // getPerimeter method that returns the perimeter of a rectangle
    double getPerimeter() {
        return 2 * (width + height);
    }
}
