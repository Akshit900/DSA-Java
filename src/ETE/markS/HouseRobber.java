package ETE.markS;


    import java.util.*;
    public class HouseRobber{
        public static int rob(int[] nums) {
            int prev1 = 0;
            int prev2 = 0;
            for (int num : nums) {
                int pick = num + prev2;
                int notPick = prev1;
                int curr = Math.max(pick, notPick);
                prev2 = prev1;
                prev1 = curr;
            }
            return prev1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(rob(nums));
        }
    }

