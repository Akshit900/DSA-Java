package Array_ArrayList.Revision.Question;

import java.util.Scanner;

public class Prefix2 {

    static int[] makePrefixSum(int[] arr){
        int n = arr.length;

        int[] pref = new int[n + 1];
        pref[0] = 0;

        for(int i = 1; i <= n; i++){
            pref[i] = pref[i - 1] + arr[i - 1];
        }

        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] pref = makePrefixSum(arr);

        System.out.print("Enter number of queries ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range (1-based index)");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l - 1];

            System.out.println("Sum = " + ans);
        }
    }
}
