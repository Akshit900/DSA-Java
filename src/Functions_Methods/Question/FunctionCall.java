package Functions_Methods.Question;
public class FunctionCall {

    static int findMax(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int finalAnswer(int[] arr) {
        int n = arr.length;
        int mid = (n - 1) / 2;
        int leftMax = findMax(arr, 0, mid);
        int rightMax = findMax(arr, mid + 1, n - 1);
        return gcd(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int[] arr = {12, 18, 9, 27, 30, 6};
        System.out.println("Final GCD = " + finalAnswer(arr));
    }
}

