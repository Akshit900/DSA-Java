package StartingBasics;

public class Comparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        //why we don't use == in String.
        System.out.println(s1 == s2);// -> it wil give true because they both are stored in same address.
        System.out.println(s1 == s3);// -> it will give false because s3 is stored in different address.
        //Instead we ue .equals to compare two Strings
        System.out.println(s1.equals(s3));
        /*first it will check if they both are stored in same address or having same address
        and if they are at same address it will print true but if both the Strings are having
        different address then it will check or start comparing character by character ,
        and then it will print the final Output.
         */
    }
}
