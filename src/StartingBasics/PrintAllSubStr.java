package StartingBasics;

public class PrintAllSubStr {
    public static void main(String[] args) {
        String s = "abcd";
        for(int i = 0; i <= 3; i++){
            for(int j = i+1; j <= 4; j++){
                System.out.print(s.substring(i,j) + " ");
            }
        }
    }
}
