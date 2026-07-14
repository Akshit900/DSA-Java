package Preparation_speed.Recursion;

import java.util.Scanner;

public class Main {
//1toN
        static void OneToN(int n) {

            if (n == 0) {
                return;
            }

            OneToN(n - 1);

            System.out.println(n + " ");
        }

        static void NToOne(int n){
            //base case
            if(n == 1){
                System.out.println(1);
                return;
            }
            System.out.println(n + " ");
            NToOne(n-1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            OneToN(n);
            NToOne(n);

        }
    }

