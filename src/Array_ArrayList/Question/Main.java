package Array_ArrayList.Question;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(4, 2, 4, 3, 2, 5, 3)
        );

        ArrayList<Integer> result = removeDuplicates(nums);

        System.out.println("Original List: " + nums);
        System.out.println("After Removing Duplicates: " + result);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> output = new ArrayList<>();

        for (int num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                output.add(num);
            }
        }
        return output;
    }
}
