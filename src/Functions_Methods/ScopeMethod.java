package Functions_Methods;

public class ScopeMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "John";
        {
            a = 100;//reassign the original ref variable to some other value.
            System.out.println(a);
            int c = 99;
            name = "Doe";
            //value initialized in this block will remain in the block.
        }
        System.out.println(a);
        System.out.println(name);

        //Scoping in for loops
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
//            int a = 10;
        }
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
