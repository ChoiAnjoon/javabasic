package codingtest._05_stack_queue;

import java.util.*;
// 올바른 괄호(Stack)
public class Main1 {
    public String solution(String str) {
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if (x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}