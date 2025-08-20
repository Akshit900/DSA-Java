package Switch_Nested;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1:
                System.out.println("Akshit");
                break;
            case 2:
                System.out.println("Koundal");
                break;
            case 3:
                System.out.println("Emp Number 3");
        switch(department){
            case "IT":
                System.out.println("IT Department");
                break;
            case "Management":
                System.out.println("Management Department");
                break;
            default:
                System.out.println("Enter a valid department");
        }
        break;
            default:
                System.out.println("Enter correct EmpID");
        }
        sc.close();

    }
}
