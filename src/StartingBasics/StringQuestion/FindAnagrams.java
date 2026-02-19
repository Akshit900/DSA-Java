package StartingBasics.StringQuestion;

import java.util.*;

public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        List<Integer> result = new ArrayList<>();

        // Count frequency of pattern
        for(char c : p.toCharArray()){
            pCount[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){

            // Add current character to window
            sCount[s.charAt(i) - 'a']++;

            // Remove character if window size exceeds p.length()
            if(i >= p.length()){
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            // Compare frequency arrays
            if(Arrays.equals(pCount, sCount)){
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = findAnagrams(s, p);

        System.out.println("Anagram starting indices: " + ans);
    }
}
