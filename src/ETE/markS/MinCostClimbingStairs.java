package ETE.markS;


    import java.util.*;
    public class MinCostClimbingStairs {
        public static int minCostClimbingStairs(int[] cost) {
            int prev1 = 0;
            int prev2 = 0;
            for (int i = 2; i <= cost.length; i++) {
                int curr = Math.min(prev1 + cost[i - 1],
                        prev2 + cost[i - 2]);
                prev2 = prev1;
                prev1 = curr;
            }
            return prev1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
            }
            System.out.println(minCostClimbingStairs(cost));
        }
    }

