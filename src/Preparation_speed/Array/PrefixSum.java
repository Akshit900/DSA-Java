package Preparation_speed.Array;

import java.util.Scanner;

public class PrefixSum {
    static int[] prefixSumArray(int [] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];

        }
        return arr;
    }

    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Input Array : ");
        printArray(arr);
        prefixSumArray(arr);
        printArray(arr);
    }
}
