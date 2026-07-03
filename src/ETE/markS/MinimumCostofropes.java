package ETE.markS;


    import java.util.*;
    public class MinimumCostofropes {
        static long minCost(int[] arr) {
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int x : arr) {
                pq.add((long) x);
            }
            long cost = 0;
            while (pq.size() > 1) {
                long a = pq.poll();
                long b = pq.poll();
                long sum = a + b;
                cost += sum;
                pq.add(sum);
            }
            return cost;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(minCost(arr));
        }
    }

