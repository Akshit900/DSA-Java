package Conditions_Loops;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        /*
        Syntax of for loop.
        for(initialisation; condition; increment/decrement){
        //body
        }
         */

        //Print numbers from 1 to 5
//        for(int i = 0; i <= 5; i++){
//            System.out.println(i);
//        }
        //print number from 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Input : ");
        int n = sc.nextInt();

//        for(int i = 1; i <= n; i++){
//            System.out.println(i + " ");
//            System.out.println("Hello India!");
//        }

        //While Loop.
        /*
        Syntax:
        while(condition){
           //body
           }
         */

//        int num = 1;
//        while(num <= n){
//            System.out.println(num);
//            num++;
//        }
        //do while
        /*
        do{
        //body
        }while(condition);

         */
        int num = 1;
        do{
            System.out.println("Hello");
        }while(num != 1);
    }
}
