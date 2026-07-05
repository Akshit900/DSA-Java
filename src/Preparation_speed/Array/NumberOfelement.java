package Preparation_speed.Array;

import java.util.Scanner;

public class NumberOfelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Value of X ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
