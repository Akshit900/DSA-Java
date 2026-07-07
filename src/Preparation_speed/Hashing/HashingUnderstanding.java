package Preparation_speed.Hashing;

import java.util.Scanner;

public class HashingUnderstanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] hash = new int[13];
        for(int i=0; i<n; i++){
            hash[arr[i]] += 1;
        }
        System.out.print("Enter q : ");
        int q = sc.nextInt();
        while(q > 0){
            int nums = sc.nextInt();
            //fetch
            System.out.print(hash[nums] + " ");
            q--;
        }

    }
}
