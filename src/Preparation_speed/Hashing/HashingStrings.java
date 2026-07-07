package Preparation_speed.Hashing;

import java.util.Scanner;

public class HashingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Characters : ");
        String s = sc.nextLine();
        System.out.print("Enter number of q : ");
        int q = sc.nextInt();
        //pre computing
        int [] hash = new int[256];//we have 256 total number of characters existing.
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)]++;
        }
        while (q > 0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c] + " ");
            q--;
        }

    }
}
