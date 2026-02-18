package StartingBasics.StringQuestion;

public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "ABRABADAADAB";

        String result = longestPalindrome(s);

        System.out.println("Longest Palindromic Substring: " + result);
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 2)
            return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expand(s, i, i);       // odd length palindrome
            int len2 = expand(s, i, i + 1);   // even length palindrome

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expand(String s, int l, int r) {

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }
}
