package StartingBasics;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello" + " " + name);
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" " + "Doe"));

        String name2 = "John Doe";
        System.out.println(Arrays.toString(name2.toCharArray()));
    }
}
