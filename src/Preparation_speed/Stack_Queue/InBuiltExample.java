package Preparation_speed.Stack_Queue;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(42);
        stack.push(9);
        stack.push(2);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(18);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addFirst(10);

        deque.addLast(30);
        deque.addLast(40);
        deque.addFirst(10);
        deque.addLast(40);




        System.out.println(deque);

    }
}
