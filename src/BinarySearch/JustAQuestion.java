package BinarySearch;

public class JustAQuestion {
    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;         // potential answer
                end = mid - 1;     // try to find earlier occurrence
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 9};
        int target = 4;

        System.out.println("First occurrence index: " + firstOccurrence(arr, target));
    }
}
