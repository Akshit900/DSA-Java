package Array_ArrayList;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 3, 1, 5, 9, 2, 8));

        // Step 1: Remove duplicates using LinkedHashSet (keeps order)
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        // Step 2: Sort the ArrayList
        Collections.sort(list);

        // Step 3: Print the final list
        System.out.println("Final ArrayList (unique + sorted): " + list);
    }
}
