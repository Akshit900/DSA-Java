package Question;

import java.util.Scanner;
public class QuestionLargest {
    public static void main(String[] args) {
      //Find the Largest of the three numbers?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
            int a = sc.nextInt();
        System.out.println("Enter b : ");
            int b = sc.nextInt();
        System.out.println("Enter c : ");
            int c = sc.nextInt();
        int max = a;
        if(b > max){
            max = b;

        }if(c > max){
            max = c;
        }
        System.out.println("Largest number among these three is : " + max);
    }
}
