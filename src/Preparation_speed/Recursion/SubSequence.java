package Preparation_speed.Recursion;

public class SubSequence {
    static void subSeq(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSeq(str, idx+1, newString + currChar);
        subSeq(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}
