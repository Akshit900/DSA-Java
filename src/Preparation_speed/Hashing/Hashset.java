package Preparation_speed.Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        //Insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //Size of the Set
        System.out.println("Size of the set is : " + set.size());

        //Search (Contains)
        if(set.contains(1)){
            System.out.println("Set Contain 1" + set);
        }if(!set.contains(6)){
            System.out.println("Set doesn't Contain 6");
        }else{
            System.out.println("Set Contains 6" + set);
        }
        //Delete(Remove)
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set Doesn't Contain 1 or has been removed ");
        }

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
