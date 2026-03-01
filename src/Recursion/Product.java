package Recursion;

public class Product {
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }
    static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return prod(n/10) * (n%10);
    }
}
