package myprgm;
import java.util.*;
/*
Question:
Perform string operations:
- Creation, length, char access
- comparison, searching, substring
- modification, whitespace handling
- concatenation, splitting
- StringBuilder demo
- formatting
- email validation using contains, startsWith, endsWith
*/



public class Program3A {

   public static void main(String[] args) {

       String str1 = "  AIET Engineering College  ";
       String str2 = "AIET Engineering College";

       System.out.println("Length: " + str1.length());
       System.out.println("Char: " + str1.charAt(3));
       System.out.println("Equals: " + str1.trim().equals(str2));
       System.out.println("Contains AIET: " + str1.contains("AIET"));
       System.out.println("Substring: " + str1.substring(2, 6));
       System.out.println("Replace: " + str1.replace("AIET", "Aalwaas"));
       System.out.println("Trim: " + str1.trim());
       System.out.println("Concat: " + str2.concat(" - CSE"));

       String[] parts = str2.split(" ");
       System.out.println("Split:");
       for (String s : parts) {
           System.out.println(s);
       }

       StringBuilder sb = new StringBuilder("AIET");
       sb.append(" College");
       System.out.println("StringBuilder: " + sb);

       System.out.println(String.format("Welcome %s", "Vikas"));

       String email = "student@aiet.edu";
       if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
           System.out.println("Valid Email");
       } else {
           System.out.println("Invalid Email");
       }
   }
}