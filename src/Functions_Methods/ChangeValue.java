package Functions_Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array(just for collection of Integers)
        int[] arr = {1, 3, 2, 45, 6};
         change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
