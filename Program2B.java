package myprgm;

/*
Question:
Performance test on StringBuffer and StringBuilder by appending "AIET" 10000 times.
Justify which is better.
*/

public class Program2B {

    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer test
        long start1 = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("AIET");
        }

        long end1 = System.currentTimeMillis();

        // StringBuilder test
        long start2 = System.currentTimeMillis();

        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append("AIET");
        }

        long end2 = System.currentTimeMillis();

        // Results
        System.out.println("StringBuffer Time: " + (end1 - start1) + " ms");
        System.out.println("StringBuilder Time: " + (end2 - start2) + " ms");

        // Justification
        System.out.println("\nConclusion:");
        System.out.println("StringBuilder is faster because it is not synchronized.");
        System.out.println("StringBuffer is thread-safe but slower.");
    }
}