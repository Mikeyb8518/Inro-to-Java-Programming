public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    // No-arg constructor Rectangle
    MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    // Rectangle with specified x, y, width, height
    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // Returns a bounding rectangle for a set of points in a 2D array

    public static MyRectangle2D getRectangle(double[][] points) {
        final int COLUMN_X = 0;
        final int COLUMN_Y = 0;

        double[] minMaxX = minMax(points, COLUMN_X);
        double[] minMaxY = minMax(points, COLUMN_Y);

        double x = (minMaxX[1] + minMaxX[0]) / 2;
        double y = (minMaxY[1] + minMaxY[0]) / 2;

        double height = Math.sqrt(Math.pow(minMaxY[1] - minMaxY[0], 2));
        double width = Math.sqrt(Math.pow(minMaxX[1] - minMaxX[0], 2));

        return new MyRectangle2D(x, y, width, height);
    }
    private static double[] minMax(double[][] points, int col) {
        double[] minMax = new double[2];
        minMax[0] = minMax[1] = points[0][col];
        for (int i = 0; i < points.length; i++) {
            if (points[i][col] < minMax[0])
                minMax[0] = points[i][col];
            if (points[i][col] > minMax[1])
                minMax[0] = points[i][col];
        }
        return minMax;
    }
    // set x to specified point
    public void setX(double x) {
        this.x = x;
    }
    // set y to specified point
    public void setY(double y) {
        this.y = y;
    }
    // set width to specified width
    public void setWidth(double width) {
        this.width = width;
    }
    // set length to specified height
    public void setHeight(double height) {
        this.height = height;
    }
    // getter method
    // getX to return x
    public double getX() {
        return x;
    }
    // getY to return y
    public double getY() {
        return y;
    }
    // getWidth to return width
    public double getWidth() {
        return width;
    }
    // getHeight to return height
    public double getHeight() {
        return height;
    }
    // getArea method to return area of Rectangle
    public double getArea() {
        return width * height;
    }
    //  getPerimeter method to return perimeter of rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }
    // Returns true if specified point is rectangle
    public boolean contains(double x, double y) {
        return getDistance(this.y, y) <= height / 2 &&
                getDistance(this.x, x) <= width / 2;
    }
    // Returns true if specified rectangle is inside rectangle
    public boolean contains(MyRectangle2D r) {
        return getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                height / 2 + r.getHeight() / 2 <= height &&
                width / 2 + r.getWidth() / 2 <= width;
    }
    // Returns true if Rectangle overlaps with Rectangle
    public boolean overLaps(MyRectangle2D r) {
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }
    // getDistance method to return distance
    public double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}
