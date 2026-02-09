package Array_ArrayList.Revision.Question;

import java.util.Scanner;
public class MaxSubarraySum {
    public static long maxSubArraySum(int [] arr, int k){
        long maxSum = 0;
        long sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum = sum;
        //Sliding Window
        for(int i=k;i<arr.length;i++){
            sum = sum+arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        long result = maxSubArraySum(arr, k);
        System.out.println("Maximum Subarray Sum of size k: " + result);
    }
}
