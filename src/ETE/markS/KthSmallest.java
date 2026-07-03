package ETE.markS;


    import java.util.*;
    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public class KthSmallest {
        static int count = 0;
        static int ans = 0;
        public static int kthSmallest(TreeNode root, int k) {
            inorder(root, k);
            return ans;
        }
        public static void inorder(TreeNode root, int k) {
            if (root == null) {
                return;
            }
            inorder(root.left, k);
            count++;
            if (count == k) {
                ans = root.val;
                return;
            }
            inorder(root.right, k);
        }
        public static TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if (val < root.val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            TreeNode root = null;
            for (int i = 0; i < n; i++) {
                root = insert(root, sc.nextInt());
            }
            int k = sc.nextInt();
            System.out.println(kthSmallest(root, k));
        }
    }

