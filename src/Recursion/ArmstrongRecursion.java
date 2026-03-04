package Recursion;

public class ArmstrongRecursion {

    static int armstrong(int n) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;
        return (digit * digit * digit) + armstrong(n / 10);
    }

    public static void main(String[] args) {

        int num = 153;
        int result = armstrong(num);

        if (result == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
