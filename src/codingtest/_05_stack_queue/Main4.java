package codingtest._05_stack_queue;
import java.util.*;
// 후위식 연산 (Stack)
public class Main4 {
    public int solution(String str) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(Integer.parseInt(String.valueOf(x)));
            else{
                int rt=stack.pop();
                int lt=stack.pop();
                if (x=='+') stack.push(lt+rt);
                else if (x=='-') stack.push(lt-rt);
                else if (x=='*') stack.push(lt*rt);
                else if (x=='/') stack.push(lt/rt);
            }
        }
        // answer=stack.get(0)
        for (int x: stack) answer=x;
        return answer;
    }
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}
