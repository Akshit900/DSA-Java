package ETE;
//2223
import java.util.*;

public class SumOfScores {
    public static long sumScores(String s) {
        char[] ca = s.toCharArray();
        int n = ca.length;
        int[] z = new int[n];
        int x = 0, y = 0;
        long ans = n;
        for (int i = 1; i < n; i++) {
            if (i <= y) {
                z[i] = Math.min(z[i - x], y - i + 1);
            }
            while (i + z[i] < n && ca[z[i]] == ca[i + z[i]]) {
                z[i]++;
            }
            if (i + z[i] - 1 > y) {
                x = i;
                y = i + z[i] - 1;
            }
            ans += z[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sumScores(s));
    }
}