package Functions_Methods;

public class Swap {
    public static void main(String[] args) {
     int a = 10;
     int b = 20;

     //Swapping numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println("a is now : " + a + " & " + "b is now : " + b);
        String name = "Iron Man";
        changename(name);
        System.out.println(name);
    }
    static void changename(String naam){
        naam = "Hulk";

    }
    //Swapping two numbers by using Function.
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
