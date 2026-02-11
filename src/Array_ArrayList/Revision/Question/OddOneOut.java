package Array_ArrayList.Revision.Question;

import java.util.HashMap;

public class OddOneOut {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("Odd one out: " + key);
                break;
            }
        }
    }
}
