package Functions_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
    int ans = sum2();
        System.out.println(ans);
    }
    //Return the Value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        return num1 + num2;
        //here when ever you hit a return statement it means the function is going to end here.

    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
        sc.close();
    }
    /*
    return_type name (){
    //body
    return statement;
    }
     */


}
