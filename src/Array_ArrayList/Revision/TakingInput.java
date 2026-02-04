package Array_ArrayList.Revision;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of element: ");
        int [] arr = new int[n];
        //Taking input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //for Output
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
