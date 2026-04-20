package myprgm;

/*
Question: Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations:
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,
5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating over list,
10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

import java.util.*;

public class Program1A {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Add at specific index
        arrayList.add(1, "Mango");

        // Add multiple elements
        arrayList.addAll(Arrays.asList("Grapes", "Pineapple"));

        // Access
        System.out.println(arrayList.get(2));

        // Update
        arrayList.set(0, "Kiwi");

        // Remove
        arrayList.remove("Banana");

        // Search
        System.out.println(arrayList.contains("Apple"));

        // Size
        System.out.println(arrayList.size());

        // Iterate
        for (String s : arrayList) {
            System.out.println(s);
        }

        // Iterator
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Sorting
        Collections.sort(arrayList);

        // Sublist
        System.out.println(arrayList.subList(0, 2));

        // Clear
        arrayList.clear();
    }
}
