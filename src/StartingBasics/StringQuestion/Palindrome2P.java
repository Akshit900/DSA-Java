package StartingBasics.StringQuestion;

public class Palindrome2P {
    public static void main(String[] args) {
        String str = "abcddcba";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true; //String is Palindrome
        while(i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
