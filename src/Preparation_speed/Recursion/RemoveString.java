package Preparation_speed.Recursion;

import java.util.Scanner;

public class RemoveString {
    static String removeA(String s, int idx){
        if(idx == s.length()) return " ";
        String smallAns = removeA(s,idx+1);
        char curr = s.charAt(idx);
        if(curr != 'a'){
            return curr + smallAns;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
    }
}
