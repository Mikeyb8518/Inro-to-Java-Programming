public class fan {
    // Constants for speed and private variables for speed, on, radius
    // color variable
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;

    private boolean on;

    private double radius;

    String color;
    // Constructor that creates a default fan
    fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    // Mutator methods
    // sets speed
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    // Sets fan on
    public void turnOn() {
        on = true;
    }
    // Sets fan off
    public void turnOff() {
        on = false;
    }
    // Sets color
    public void setColor(String newColor) {
        color = newColor;
    }
    // Sets radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    // Accessor methods
    // returns speed
    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW";
            break;

            case MEDIUM: s = "MEDIUM";
            break;

            case FAST: s = "FAST";
        }
        return s;
    }
    // Returns on
    public boolean isOn() {
        return on;
    }
    // Returns radius
    public double getRadius() {
        return radius;
    }
    // Returns color
    public String getColor() {
        return color;
    }
    // Returns a string description for the fan
    public String toString() {
        if (on == true) {
            return "\n Fan speed: " + getSpeed() + ", Color: " + color + ", Radius: " + radius + "\n";
        }
        else {
            return "Fan Color: " + color + ", radius: " + radius + "\n Fan is off\n";
        }
    }
}
