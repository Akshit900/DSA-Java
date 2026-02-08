package Array_ArrayList.Revision.Question;

import java.util.Scanner;

public class Prefix1 {
    static void  printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int [] makePrefixSum(int [] arr){
        int n = arr.length;
        int [] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1] + arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter" + " " + n + " " + "Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("input Array");
        printArray(arr);

        int [] pref = makePrefixSum(arr);
        printArray(pref);
    }
}
