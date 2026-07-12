package Preparation_speed.Strings_StringBuilders;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('J'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
