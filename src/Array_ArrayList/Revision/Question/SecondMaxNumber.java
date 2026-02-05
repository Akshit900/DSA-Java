package Array_ArrayList.Revision.Question;

import java.util.Scanner;

public class SecondMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max)
                smax=arr[i];
        }
        System.out.println(smax);
    }
}
