package Preparation_speed.Array;


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int s = 0;
        for(int i = 0; i < n; i++){
            s+=arr[i];
        }
        System.out.println(s);
    }
}
