public class Execute {
    public static void main(String[] args) {
        // Constants for fan speed
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        // Create 2 fan objects
        fan fan1 = new fan();
        fan fan2 = new fan();
        // fan1 speed set to fast, radius 10, color is yellow, and is turned on
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();
        // fan2 speed set to medium, radius 5, color is blue, and is turned off
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();
        // display results by invoking toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
