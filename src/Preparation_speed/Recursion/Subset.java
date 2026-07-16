package Preparation_speed.Recursion;

import java.util.ArrayList;

//subset of a set of first N natural numbers;
public class Subset {
    static void printSubSet(ArrayList<Integer>subSet){
        for(int i=0; i<subSet.size(); i++){
            System.out.print(subSet.get(i)+"");
        }
        System.out.println();
    }
    static void findSubSet(int n, ArrayList<Integer>subSet){
        if(n == 0) {
            printSubSet(subSet);
            return;
        }
        //add
        subSet.add(n);
        findSubSet(n-1, subSet);
        //remove
        subSet.remove(subSet.size()-1);
        findSubSet(n-1, subSet);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubSet(n, subSet);
    }
}
