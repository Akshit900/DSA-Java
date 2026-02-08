package Array_ArrayList.Revision.Question;
//Given an integer arr 'a', return the prefix sum/running sum int the same arr without creating a new array.
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

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1] + arr[i];
        }
        return arr;
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
