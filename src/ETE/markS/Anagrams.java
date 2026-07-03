package ETE.markS;

import java.util.*;
public class Anagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) {
            return ans;
        }
        int[] freqP = new int[26];
        int[] window = new int[26];
        for (char c : p.toCharArray()) {
            freqP[c - 'a']++;
        }
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(freqP, window)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }
}
