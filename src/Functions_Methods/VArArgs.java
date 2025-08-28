package Functions_Methods;

import java.util.Arrays;

public class VArArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8, 9, 14, 15, 16);
        multiple(2,3,"John");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
