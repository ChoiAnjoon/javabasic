package codingtest._05_stack_queue;
import java.util.*;

// 쇠막대기 문제
public class Main5 {
    public int solution(String str) {
        int answer=0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1)=='(') answer+=stack.size();
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
