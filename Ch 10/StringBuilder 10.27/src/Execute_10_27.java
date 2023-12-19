public class Execute_10_27 {
    public static void main(String[] args) {
        // Create a MyStringBuilder1 object
        MyStringBuilder1 str1 = new MyStringBuilder1("Test");

        // Test methods
        System.out.println("\nAppended the string \"MyStringBuilder1\" to string: ");
        str1.append(new MyStringBuilder1(" MyStringBuilder1"));

        System.out.println("\nAppend integer 101 to the string: " +
                str1.append(101));
        // Display the length of str1
        System.out.println("\nLength of string: " + str1.length());

        // Display character at index 2
        System.out.println("\nCharacter at index 2: " + str1.charAt(2));

        // Display str1 to lowercase
        System.out.println("\nString to lower case: " + str1.toLowerCase());

        // Display substring of str1 from index 1 to index 3
        System.out.println("\nSubstring of the string from index 1 to index 3: " + str1.substring(1, 3));

        // Return the string
        System.out.println("\nDisplay the string: " + str1.toString());
    }
}
