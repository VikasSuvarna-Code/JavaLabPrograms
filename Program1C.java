package myprgm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*
Question:
LinkedList programs:
1. Iterate from 2nd position using iterator
2. Iterate linked list in reverse order
3. Insert element at end using offerLast()
4. Display elements with their positions
5. Swap first and third elements using Collections.swap()
*/



public class Program1C {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Initial elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        System.out.println("Original List: " + list);

        // 1. Iterator from 2nd position
        System.out.println("\n1. Iterator from 2nd position:");
        Iterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Reverse iteration
        System.out.println("\n2. Reverse Order:");
        Iterator<String> rit = list.descendingIterator();
        while (rit.hasNext()) {
            System.out.println(rit.next());
        }

        // 3. Insert at end
        list.offerLast("Pink");
        System.out.println("\n3. After offerLast(): " + list);

        // 4. Display elements with positions
        System.out.println("\n4. Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }

        // 5. Swap first and third elements
        if (list.size() >= 3) {
            Collections.swap(list, 0, 2);
        }
        System.out.println("\n5. After swapping 1st and 3rd elements: " + list);
    }
}