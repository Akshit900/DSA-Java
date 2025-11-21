package LinearSearch;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 10, 4, 18};
        System.out.println(findIndex(arr));
    }

    public static int findIndex(int[] arr) {
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > leftSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
