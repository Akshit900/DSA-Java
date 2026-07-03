package ETE.markS;


    import java.util.*;
    public class LongestIncreasingSubsequence {
        public static int lengthOfLIS(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                int idx = Collections.binarySearch(list, num);
                if (idx < 0) {
                    idx = -(idx + 1);
                }
                if (idx == list.size()) {
                    list.add(num);
                } else {
                    list.set(idx, num);
                }
            }
            return list.size();
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(lengthOfLIS(nums));
        }
    }
