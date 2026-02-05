package Array_ArrayList.Revision.Question;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
            int n = sc.nextInt();
        System.out.println("Enter The number Of element");
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        System.out.println("Enter the element x");
            int x = sc.nextInt();
            int Count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>x)
                    Count++;
            }
        System.out.println(Count);
        }
    }

