package Preparation_speed.Recursion;

public class Fibonacci {
    static int fibonacci(int n){
        if(n == 0 || n == 1) return n;
        int prev = fibonacci(n-1);
        int prevPrev = fibonacci(n-2);
        return prev + prevPrev;

    }
    public static void main(String[] args) {
        for(int i=0; i<=10; i++)
         System.out.print(fibonacci(i) + " ");
    }
}
