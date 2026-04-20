package myprgm;
import java.util.*;

/*
Question:
String functions:
isNullOrEmpty, countOccurrences, reverseString,
isPalindrome, removeWhitespace
*/

public class Program3B{

    // Q1
    static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    // Q2
    static int countOccurrences(String str, String sub) {
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        return count;
    }

    // Q3
    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Q4
    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equals(reverseString(s));
    }

    // Q5
    static String removeWhitespace(String s) {
        return s.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        System.out.println(isNullOrEmpty("  "));
        System.out.println(countOccurrences("java java java", "java"));
        System.out.println(reverseString("AIET"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(removeWhitespace("A I E T College"));
    }
}