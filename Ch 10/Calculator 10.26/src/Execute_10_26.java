public class Execute_10_26 {
    // Main Class
    public static void main(String[] args) {
        String a = args[0].replaceAll(" ", "");
        a = a.replaceAll("[+]", "#+#");
        a = a.replaceAll("[-]", "#-#");
        a = a.replaceAll("[*]", "#*#");
        a = a.replaceAll("[/]", "#/#");
        args = a.split("#");

        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java calculator operand1 operator operand2");
            System.exit(1);
        }

        // Result of operation
        int result = 0;

        // Determine the operation
        switch (args[1].charAt(0)) {
            case '+' : result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-' : result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*' : result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' : result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }
        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
