package codingtest._01_string;
import java.util.*;

// 암호
public class Main12 {
    public String solution(int n, String str) {
        String answer="";
        for (int i=0; i<n; i++) {
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2); // 2진수의 10진수화
            answer+=(char)num; // 10진수를 아스키번호로 바꿈
            str = str.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n, str));
    }
}
