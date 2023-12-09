public class Circle2D {
    // Data Fields
    private double x;
    private double y;
    private double radius;

    // no-arg constructor that creates a default circle
    Circle2D() {
        this(0, 0, 1);
    }
    // Constructor with specified x, y, radius

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    // Return x
    public double getX() {
        return x;
    }
    // Return y
    public double getY() {
        return y;
    }
    // Return radius
    public double getRadius() {
        return radius;
    }
    // getArea returns the area of a circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    // getPerimeter returns the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // Returns true if specified point is inside the circle
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2)) < radius;
    }
    // Returns true if specified circle is inside circle
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX(), 2) +
                Math.pow(circle.getY(), 2)) <= Math.abs(radius - circle.getRadius());
    }
    // Returns true if specified circle overlaps with another circle
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX(), 2) +
                Math.pow(circle.getY(), 2)) <= radius + circle.getRadius();
    }
}
