public class LinearEquation {
    // Data Fields
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    // Constructor with arguments for a, b, c, d, e, f
    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Methods
    // Return a
    public double getA() {
        return a;
    }
    // Return b
    public double getB() {
        return b;
    }
    // Return c
    public double getC() {
        return c;
    }
    // Return d
    public double getD() {
        return d;
    }
    // Return e
    public double getE() {
        return e;
    }
    // Return f
    public double getF() {
        return f;
    }
    // Returns true if ad - bc not equal to 0
    public boolean isSolvable() {
        return a * d - b * c != 0;
    }
    //Returns x
    public double getX() {
       return (e * d - b * f) / (a * d - b * c);
    }
    // Returns y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}
