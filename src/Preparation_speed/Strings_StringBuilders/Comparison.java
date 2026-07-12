package Preparation_speed.Strings_StringBuilders;

public class Comparison {
    public static void main(String[] args) {
        String a = "John";
        String b = "John";
        System.out.println(a == b);
        String name1 = new String("John");
        String name2 = new String("John");
        //this if for comparing two strings;
//        System.out.println(name1 == name2);
        //if you want to check the values or compare the values inside the strings you use .equals();
        System.out.println(name1.equals(name2));
    }
}
