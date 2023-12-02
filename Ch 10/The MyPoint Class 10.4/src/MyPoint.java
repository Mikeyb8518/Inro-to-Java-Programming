public class MyPoint {
    // Data fields
    private double x;
    private double y;

    // Constructor that creates point (0,0)
    MyPoint() {
        this(0,0);
    }

    // Constructor that creates a point with a specified point
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    // getX method returns x
    public double getX() {
        return x;
    }

    // getY method returns y
    public double getY() {
        return y;
    }

    // Distance method that returns the distance from this point to a specified point
    // of the MyPoint type
    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +
                Math.pow(myPoint.getY() - y, 2));
    }

    // Distance method that returns the distance from specified x-coordinate, y-coordinate
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }
}
