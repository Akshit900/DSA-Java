package StartingBasics.StringQuestion;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(i == 0 && str.charAt(i) != ' ') {
                count++;
            }
            else if(str.charAt(i) != ' ' && str.charAt(i-1) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
    }
}
