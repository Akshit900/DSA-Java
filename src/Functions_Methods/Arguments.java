package Functions_Methods;
//pass the value of number when you are calling the method in the main().
public class Arguments {
    public static void main(String[] args) {
      int ans = sum1(20, 30);
        System.out.println(ans );
    }
    static int sum1(int a, int b){
        int sum = a + b;
        return sum;
    }
}
