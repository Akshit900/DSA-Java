package Preparation_speed.Array;

import java.util.Scanner;

public class SortingArray {
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int [] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static int [] arraySquare(int [] arr){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int [] ans = new int[n];
        int k = n-1;
        while(l<=r){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                ans[k--] = arr[l]*arr[l];
                l++;
            }else{
                ans[k--] = arr[r]*arr[r];
                r--;
            }
        }
        return ans;
    }
    static void parity(int [] arr){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            if(arr[l]%2==1 && arr[r]%2==0){
                swap(arr, l, r);
                l++;
                r--;
            }
            if(arr[l]%2==0){
                l++;
            }
            if(arr[r]%2==1){
                r--;
            }
        }
    }
    static void sortZeroesAndOnes(int [] arr){
        int n = arr.length;
        int l = 0; int r = n-1;
        while (l<r){
            if(arr[l]==1 && arr[r]==0){
                swap(arr, l, r);
                l++;
                r--;
            }
            if(arr[l]==0){
                l++;
            }
            if(arr[r]==1){
                r--;
            }
        }

//        int count = 0;
//        for(int i = 0; i<n; i++){
//            if(arr[i] == 0){
//                count++;
//            }
//        }
//        for(int i=0; i<n; i++){
//            if(i<count){
//                arr[i] = 0;
//            }else{
//                arr[i] = 1;
//            }
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Array Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        printArray(arr);
//        sortZeroesAndOnes(arr);
        int [] ans = arraySquare(arr);

//        parity(arr);
        System.out.println("Array is Sorted");
//        reverse(ans);
        printArray(ans);

    }
}
