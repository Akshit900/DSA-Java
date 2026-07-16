package Preparation_speed.Recursion;

import java.util.Scanner;

public class Palindrome {
    static boolean findPalindrome(String s, int l, int r){
        if(l>=r) return true;
        return (s.charAt(l) == s.charAt(r) && findPalindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findPalindrome(s, 0, s.length()-1));
    }
}
