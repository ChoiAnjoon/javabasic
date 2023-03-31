package codingtest._05_stack_queue;

import java.util.*;
// 괄호문자제거
public class Main2 {
    public String solution(String str) {
        String answer="";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if (x==')') {
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        //for (int i=0; i<stack.size(); i++) answer+=stack.get(i);
        // 인덱스로도 접근가능
        for (char x: stack) answer+=x;

        return answer;
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
