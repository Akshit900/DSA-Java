package Preparation_speed.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //add elements in between
        list.add(4,4);
        System.out.println(list);

        //set elements
        list.set(0,5);
        System.out.println(list);

        //delete elements
        list.remove(0);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
