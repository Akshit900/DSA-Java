package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Primitive
        int [] arr = new int[5];
//        //Input using forLoop
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));

        //Array to Object
        String [] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
