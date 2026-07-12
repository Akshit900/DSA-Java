package Preparation_speed.Strings_StringBuilders;

public class Performance {
    public static void main(String[] args) {
        String series = " ";
        for(int i=0; i<26; i++) {
            char ch = (char) ('a' + i);
//            System.out.println(ch);
            series += ch;

            System.out.print(series);
            //this is not good because it will again and again add the next alphabet to the string and make a new string till the end of the alphabets;
        }
    }
}
