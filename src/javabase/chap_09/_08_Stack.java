package javabase.chap_09;

import java.util.Stack;

public class _08_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.contains(1));
        System.out.println(stack.empty());
        System.out.println(stack);

    }
}
