package Array_ArrayList.Revision;
import java.util.*;
public class Hashmap1 {
    public static void main(String[] args) {
        //key-Country, Value-Population.
        HashMap<String, Integer>map = new HashMap<>();
        //Adding key&value
        map.put("India",120);
        map.put("China",140);
        map.put("US",50);
        System.out.println(map);
        //Search Operation or Lookup Operation
        if(map.containsKey("China")){
            System.out.println("Key is Present");
        }else{
            System.out.println("Key is not Present");
        }

        //Get Function
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //Iteration in HashMap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
