package Recursion;

public class Reverse {

        public static int reverseNumber(int n, int rev) {
            if (n == 0) return rev;

            int digit = n % 10;
            return reverseNumber(n / 10, rev * 10 + digit);
        }

        public static void main(String[] args) {
            int num = 1234;
            System.out.println(reverseNumber(num, 0));
        }
    }

