package Question;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet : ");
      char ch = sc.next().trim().charAt(0);
//      String word = "Hello";
//        System.out.println(word.charAt(0));
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
