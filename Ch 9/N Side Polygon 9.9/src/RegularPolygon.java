public class RegularPolygon {
    // private variables for polygon
    private int n;
    private double side;
    private double x;
    private double y;
    // Creates a regular polygon with default values
    RegularPolygon() {
        n = 3;
        side = 1;
        x = y = 0;
    }
    // Creates a polygon with specified number of sides, length of side, and X, Y coordinates
    RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }
    // Creates a regular polygon with specified number of sides, length of sides, centered at (0,0)
    RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = y = 0;
    }
    // Methods
    // Sets new N
    public void setN(int newN) {
        n = newN;
    }
    // Sets new length of side
    public void setSide(double newSide) {
        side = newSide;
    }
    // Sets new Y
    public void setX(double newX) {
        x = newX;
    }
    // Sets new Y
    public void setY(double newY) {
        y = newY;
    }
    // Returns n
    public int getN() {
        return n;
    }
    // Returns length of sides
    public double getSide() {
        return side;
    }
    // Returns x-coordinate
    public double getX() {
        return x;
    }
    // Returns y- coordinate
    public double getY() {
        return y;
    }
    // getPerimeter method returns the perimeter of polygon
    public double getPerimeter() {
        return side * n;
    }
    // getArea method returns the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
