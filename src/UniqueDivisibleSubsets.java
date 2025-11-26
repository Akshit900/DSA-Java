import java.util.*;

public class UniqueDivisibleSubsets {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6, 8};
        int k = 5;

        // Calling the main function which handles the entire logic
        List<List<Integer>> result = findDivisibleSubsets(nums, k);

        System.out.println("Subsets whose sum is divisible by " + k + ":");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    // This function acts like the 'manager' that prepares things before deep work begins
    public static List<List<Integer>> findDivisibleSubsets(int[] nums, int k) {
        Arrays.sort(nums);  // Sorting helps us handle duplicates easily

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), 0, k, result);

        return result;
    }

    /**
     * This is the heart of the program — the backtracking function.
     * Think of this as the worker who tries all possibilities.
     */
    private static void backtrack(int[] nums, int index, List<Integer> current,
                                  int currentSum, int k, List<List<Integer>> result) {

        // If the sum so far is divisible by k, we save the subset
        if (currentSum % k == 0 && !current.isEmpty()) {
            result.add(new ArrayList<>(current));  // add a copy
        }

        // Loop through remaining numbers
        for (int i = index; i < nums.length; i++) {

            // Avoid picking the same number again in this level (duplicate prevention)
            if (i > index && nums[i] == nums[i - 1]) {
                continue; // skipping duplicates
            }

            // Choose the current number
            current.add(nums[i]);

            // We move deeper — making another function call (classic recursion)
            backtrack(nums, i + 1, current, currentSum + nums[i], k, result);

            // Undo the choice (backtrack step)
            current.remove(current.size() - 1);
        }
    }
}
