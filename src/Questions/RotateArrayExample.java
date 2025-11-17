package Questions;

import java.util.Scanner;

public class RotateArrayExample {

    // Function to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // handle large k values

        // Reverse whole array
        reverse(arr, 0, n - 1);

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.println("Array after rotation:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
