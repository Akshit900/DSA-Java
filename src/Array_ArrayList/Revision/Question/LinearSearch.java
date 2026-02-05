package Array_ArrayList.Revision.Question;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9};
//        int x = 5;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }
    }
}
