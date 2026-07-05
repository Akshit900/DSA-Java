package Preparation_speed.Array;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of element : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enetr the value of X : ");
        int x = sc.nextInt();
//        boolean flag = false;
        System.out.print("Enter the Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==x){
                System.out.println(x);
//                flag = true;
//                break;
            }

        }
//        if(flag==false){
//            System.out.println("not found");
//        }else{
//            System.out.println("found");
//        }
//        sc.close();;
    }
}
