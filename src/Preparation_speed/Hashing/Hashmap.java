package Preparation_speed.Hashing;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("China",150);
        map.put("Russia",100);
        System.out.println(map);

        //Search
        if(map.containsKey("Russia")){
            System.out.println("Is Present");
        }else{
            System.out.println("Not Present");
        }
        //Iteration
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
