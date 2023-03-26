package codingtest._01_string;

import java.util.*;

// 대소문자 변환
public class Main2 {
    public String solution(String str) {
        String answer="";
        for (char x: str.toCharArray()) {
            if (Character.isUpperCase(x)) answer+=Character.toLowerCase(x);
            else answer+=Character.toUpperCase(x);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
