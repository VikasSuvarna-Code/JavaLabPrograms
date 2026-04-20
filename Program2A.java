package myprgm;

/*
Question:
Develop a Java program for performing various string operations:
- Creation and basic operations
- Length and character access
- Comparison
- Searching
- Substring
- Modification
- Whitespace handling
- Concatenation
- Splitting
- StringBuilder demo
- String formatting
- Email validation using contains, startsWith, endsWith
*/

public class Program2A {

    public static void main(String[] args) {

        // String Creation
        String str1 = "  AIET College  ";
        String str2 = "AIET College";

        // Length
        System.out.println("Length: " + str1.length());

        // Character access
        System.out.println("Char at 2: " + str1.charAt(2));

        // Comparison
        System.out.println("Equals: " + str1.trim().equals(str2));

        // Searching
        System.out.println("Contains 'AIET': " + str1.contains("AIET"));

        // Substring
        System.out.println("Substring: " + str1.substring(2, 6));

        // Modification
        System.out.println("Replace: " + str1.replace("AIET", "Aalwaas"));

        // Whitespace handling
        System.out.println("Trim: " + str1.trim());

        // Concatenation
        System.out.println("Concat: " + str2.concat(" - CSE Dept"));

        // Splitting
        String[] parts = str2.split(" ");
        for (String s : parts) {
            System.out.println("Split: " + s);
        }

        // StringBuilder demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder: " + sb);

        // String formatting
        String name = "Vikas";
        System.out.println(String.format("Hello %s, welcome to AIET", name));

        // Email validation
        String email = "student@aiet.edu";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

}
