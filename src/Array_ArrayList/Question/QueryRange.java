package Array_ArrayList.Question;
import java.util.*;
public class QueryRange {


        static class TrieNode {
            TrieNode[] child = new TrieNode[2];
        }

        static void insert(TrieNode root, int num) {
            for(int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if(root.child[bit] == null)
                    root.child[bit] = new TrieNode();
                root = root.child[bit];
            }
        }

        static int queryMaxXor(TrieNode root, int num) {
            int ans = 0;
            for(int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int opposite = 1 - bit;
                if(root.child[opposite] != null) {
                    ans |= (1 << i);
                    root = root.child[opposite];
                } else {
                    root = root.child[bit];
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int q = sc.nextInt();

            int[] prefix = new int[n+1];
            for(int i = 1; i <= n; i++)
                prefix[i] = prefix[i-1] ^ arr[i-1];

            while(q-- > 0) {
                int L = sc.nextInt();
                int R = sc.nextInt();

                TrieNode root = new TrieNode();

                // Insert prefix[L-1] initially
                insert(root, prefix[L-1]);

                int maxXor = 0;

                for(int i = L; i <= R; i++) {
                    int current = prefix[i];
                    maxXor = Math.max(maxXor, queryMaxXor(root, current));
                    insert(root, current);
                }

                System.out.println(maxXor);
            }

            sc.close();
        }
    }


