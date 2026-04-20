package myprgm;

/*
Question:
capitalizeWords, truncate, isNumeric,
generateRandomString, countWords
*/
import java.util.Random;



public class Program3C {

    static String capitalizeWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0)
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    static String truncate(String s, int len) {
        return (s.length() > len) ? s.substring(0, len) + "..." : s;
    }

    static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }

    static String generateRandomString(int len) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }
        return sb.toString();
    }

    static int countWords(String s) {
        return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
    }

    public static void main(String[] args) {

        System.out.println(capitalizeWords("hello java world"));
        System.out.println(truncate("Artificial Intelligence", 10));
        System.out.println(isNumeric("12345"));
        System.out.println(generateRandomString(8));
        System.out.println(countWords("AIET engineering college students"));
    }
}