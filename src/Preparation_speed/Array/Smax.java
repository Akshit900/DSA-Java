package Preparation_speed.Array;

import java.util.*;

public class Smax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Element : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the Elements : ");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
