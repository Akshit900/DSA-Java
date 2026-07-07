package Preparation_speed.Array;

import java.util.Scanner;

public class RangeQuery {
    static int [] prefixSumArray(int [] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] prefix = prefixSumArray(arr);
        System.out.print("number of Query : ");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.print("Enter range : ");{
                int l = sc.nextInt();
                int r = sc.nextInt();
                int ans = prefix[r]-prefix[l-1];
                System.out.println("Sum " + ans);

            }
        }
    }
}
