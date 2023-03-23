package codingtest._01_string;

import java.util.*;
// 문자 찾기
public class Main1 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) answer++;
//        }

        for (int s : str.toCharArray()) {
            if (s == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
