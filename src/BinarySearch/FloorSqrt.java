package BinarySearch;

import java.util.Scanner;

public class FloorSqrt {
    // returns floor(sqrt(x)) for x >= 0
    public static long floorSqrt(long x) {
        if (x < 2) return x;     // 0 -> 0, 1 -> 1
        long left = 0, right = x, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            // avoid mid*mid overflow by comparing mid <= x / mid
            if (mid <= x / mid) {
                ans = mid;         // mid*mid <= x, mid is a candidate
                left = mid + 1;    // try larger
            } else {
                right = mid - 1;   // mid*mid > x, go left
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer n: ");
        long n = sc.nextLong();
        System.out.println("floor(sqrt(" + n + ")) = " + floorSqrt(n));
        sc.close();
    }
}

