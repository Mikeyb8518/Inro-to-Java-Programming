public class Execute_10_22 {
    // Main Method
    public static void main(String[] args) {
        // Create char array
        char[] test = {'T', 'e', 'S', 't'};
        char[] test2 = {'T', 'e', 'S', 't', '2'};

        // Create 2 MyString objects
        MyString1 str = new MyString1(test);
        MyString1 str2 = new MyString1(test2);

        // Display character at index 1 of MyString1 object 1
        System.out.println("\nCharacter at index 1 of MyString1 object 1: " +
                str.charAt(1));
        // Display length of MyString1 object 1
        System.out.println("\nLength of MyString1 object 1: " + str.length());
        // Display a substring from index 2 to 4 of MyString1 object 1
        System.out.println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
        MyString1 substr = str.substring(2, 4);
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        System.out.println();
        // Display MyString1 object 1 to lowercase
        System.out.println("\nMyString1 object 1 to lowercase: ");
        MyString1 lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i));
        }
        System.out.println();
        // Test and display if MyString1 object 1 is equal to MyString1 object 2
        System.out.println("\nMyString1 object 1 is equal to MyString1 object 2? " +
                str.equals(str2));
        // Display 145 as a MyString object
        System.out.println("\nDisplay integer 145 as a MyString1 object: ");
        MyString1 value = str.valueOf(145);
        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i));
        }
        System.out.println();
    }
}
