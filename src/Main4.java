import java.util.*;

public class Main4 {

    // Function 1: Count the frequency of each character
    public static Map<Character, Integer> countFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    // Function 2: Find the second most frequent character
    public static char findSecondMostFrequent(Map<Character, Integer> freq) {
        if (freq.size() < 2) return '?';

        int firstMax = 0, secondMax = 0;
        char secondChar = '?';

        // Find the highest frequency
        for (int val : freq.values()) {
            if (val > firstMax) {
                firstMax = val;
            }
        }

        // Find the second highest frequency
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int val = entry.getValue();
            if (val < firstMax && val > secondMax) {
                secondMax = val;
                secondChar = entry.getKey();
            }
        }

        return secondChar;
    }

    // Main Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Map<Character, Integer> frequencyMap = countFrequency(s);
        char result = findSecondMostFrequent(frequencyMap);

        System.out.println("Second most frequent character: " + result);
    }
}
