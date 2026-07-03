package ETE.markS;

import java.util.*;

public class InfixtoPostfix {
    static int prec(char c) {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        return -1;
    }
    static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            }
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop();
            }
            else {
                while (!st.isEmpty() &&
                        prec(c) <= prec(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(infixToPostfix(s));
    }
}