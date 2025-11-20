package BinarySearch;

public class Main {

    public static int splitArray(int[] nums, int m) {
        long low = 0;
        long high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (canSplit(nums, m, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    private static boolean canSplit(int[] nums, int m, long maxAllowed) {
        int countSubarrays = 1;
        long currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= maxAllowed) {
                currentSum += num;
            } else {
                countSubarrays++;
                currentSum = num;

                if (countSubarrays > m) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        int result = splitArray(nums, m);
        System.out.println(result);
    }
}
