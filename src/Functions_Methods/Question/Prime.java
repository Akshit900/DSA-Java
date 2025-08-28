package Functions_Methods.Question;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int v = 2;
        while(v*v <= n){
            if(n % v == 0){
                return false;
            }
            v++;
        }
        if(v*v > n){
            return true;
        }
        return false;
    }
}
