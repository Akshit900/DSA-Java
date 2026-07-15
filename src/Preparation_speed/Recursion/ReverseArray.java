package Preparation_speed.Recursion;

import java.util.Arrays;

public class ReverseArray {
    static void reverseArr(int [] arr, int left, int right){
        if(left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArr(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3 ,4 ,5};
        reverseArr(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
