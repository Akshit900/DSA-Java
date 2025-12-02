package Array_ArrayList;
import java.util.ArrayList;

public class MainNo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);

        ArrayList<Integer> result = removeDuplicates(list);

        System.out.println(result);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        return unique;
    }
}


