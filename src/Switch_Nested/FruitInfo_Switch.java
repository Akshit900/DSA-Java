package Switch_Nested;
import java.util.Scanner;
public class FruitInfo_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit name : ");
        String fruit = sc.next();

//        String a = "Akshit";
//        String b = "Akshit";
//
//        System.out.println(a == b);
        //Using Switch cases for this Question First.
//        if(fruit.equals("Mango")){
//            System.out.println("King of fruits");
//
//        }
//        if(fruit.equals("Apple")){
//            System.out.println("A sweet red fruit");
//        }

        //Using Switch case for the problem.
          switch(fruit){
              case "Mango":
                  System.out.println("King of fruits");
                  break;
              case "Apple":
                  System.out.println("A sweet red fruit");
                  break;
              case "Orange":
                  System.out.println("Round orange fruit");
                  break;
              default:
                  System.out.println("Please enter a valid fruit");
              }
          }
    }

