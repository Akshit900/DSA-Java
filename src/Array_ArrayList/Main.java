package Array_ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,4,2,1,4,2,2));

        System.out.println(secondMostFrequent(list));
    }

    static int secondMostFrequent(ArrayList<Integer> list) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // count frequency
        for (int x : list)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        int max1 = 0, max2 = 0;
        int num1 = -1, num2 = -1;

        // find top 2 frequencies
        for (int key : freq.keySet()) {
            int f = freq.get(key);

            if (f > max1) {
                max2 = max1;
                num2 = num1;
                max1 = f;
                num1 = key;
            }
            else if (f > max2 && f < max1) {
                max2 = f;
                num2 = key;
            }
        }

        return num2; // second most frequent value
    }
}
