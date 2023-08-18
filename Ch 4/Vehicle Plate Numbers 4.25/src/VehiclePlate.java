public class VehiclePlate {
    public static void main(String[] args) {

        int letter1 = 65 + (int)(Math.random() * (90 - 65));
        int letter2 = 65 + (int)(Math.random() * (90 -65));
        int letter3 = 65 + (int)(Math.random() * (90 - 65));

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        int num4 = (int)(Math.random() * 10);

        System.out.println("" + (char)(letter1) + ((char)(letter2)) + ((char)(letter3)) + "-" + num1 + num2 +
                num3 + num4);
    }
}
