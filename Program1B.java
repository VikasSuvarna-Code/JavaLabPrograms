package myprgm;

/*
Question:
ArrayList programs:
1. Search whether "Red" is available or not
2. Remove 2nd element and color "Blue"
3. Sort colors using Collections.sort()
4. Extract elements using subList()
5. Delete nth element using remove by index
*/
import java.util.ArrayList;
import java.util.Collections;

public class Program1B {
 public static void main(String[] args) {

	        ArrayList<String> colors = new ArrayList<>();

	        // Initial elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Original List: " + colors);

	        // 1. Search "Red"
	        System.out.println("\n1. Is Red present? " + colors.contains("Red"));

	        // 2. Remove 2nd element and "Blue"
	        colors.remove(1);          // removes 2nd element
	        colors.remove("Blue");     // removes Blue if present
	        System.out.println("\n2. After removals: " + colors);

	        // 3. Sort colors
	        Collections.sort(colors);
	        System.out.println("\n3. Sorted List: " + colors);

	        // 4. SubList (1st and 2nd elements)
	        System.out.println("\n4. SubList (0 to 2): " + colors.subList(0, Math.min(2, colors.size())));

	        // 5. Remove nth element
	        int n = 1;
	        if (n < colors.size()) {
	            colors.remove(n);
	        }
	        System.out.println("\n5. After removing nth element: " + colors);
	    }
	
}
