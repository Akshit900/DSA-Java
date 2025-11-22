package Questions;

public class MinWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "-1";
        }

        // Frequency of characters required from t
        int[] need = new int[128]; // assuming ASCII
        int requiredTypes = 0;

        for (char c : t.toCharArray()) {
            if (need[c] == 0) {
                requiredTypes++;
            }
            need[c]++;
        }

        // Sliding window pointers
        int left = 0;
        int right = 0;

        // Frequency of characters in current window
        int[] window = new int[128];

        // How many character types currently satisfy the required frequency
        int formedTypes = 0;

        // Result: length, left index, right index
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char cRight = s.charAt(right);
            window[cRight]++;

            // If current character frequency matches what is needed
            if (need[cRight] > 0 && window[cRight] == need[cRight]) {
                formedTypes++;
            }

            // Try to shrink the window from the left
            while (left <= right && formedTypes == requiredTypes) {
                // Update answer if this window is smaller
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    minStart = left;
                }

                char cLeft = s.charAt(left);
                window[cLeft]--;

                // If removing this char breaks the requirement
                if (need[cLeft] > 0 && window[cLeft] < need[cLeft]) {
                    formedTypes--;
                }

                left++;
            }

            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "-1";
        }

        return s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String S1 = "ADOBECODEBANC";
        String T1 = "ABC";
        System.out.println(minWindow(S1, T1)); // Example: BANC

        String S2 = "a";
        String T2 = "aa";
        System.out.println(minWindow(S2, T2)); // -1
    }
}
