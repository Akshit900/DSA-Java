package Preparation_speed.Array;

import java.util.Scanner;

public class EqualPartitionSum {
    static int findSum(int [] arr){
        int totalSum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalPartition(int [] arr){
         int totalSum = findSum(arr);
         int prefSum = 0;
         for(int i=0; i<arr.length; i++){
             prefSum += arr[i];
             int suffSum = totalSum - prefSum;
             if(suffSum == prefSum){
                 return true;
             }
         }
         return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of element : ");
            int n = sc.nextInt();
            int [] arr = new int[n];
        System.out.print("Enter the elements : ");
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
        System.out.print("Equal partition possible :" + equalPartition(arr));
    }
}
