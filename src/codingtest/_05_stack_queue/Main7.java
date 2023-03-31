package codingtest._05_stack_queue;

import java.util.*;
public class Main7 {
    public String solution(String need, String plan) {
        String answer="YES";
        Queue<Character> queue = new LinkedList<>();
        for (char x: need.toCharArray()) queue.offer(x);
        for (char x: plan.toCharArray()) {
            if (queue.contains(x)) {
                if(x!=queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }
}
