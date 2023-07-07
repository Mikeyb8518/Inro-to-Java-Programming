public class randomCharacter {
    public static void main(String[] args) {
        // A through Z are represented by numbers 65-90

        int random = 65 + (int) (Math.random() * 26);

        System.out.print("The random character is " + (char) (random));
    }
}
