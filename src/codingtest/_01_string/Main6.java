package codingtest._01_string;

import java.util.*;
// 중복문자제거

public class Main6 {

    public String solution(String str) {
        String answer="";
        for (int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
            // 인덱스 번호가 같으면 중복문자가 아니다.
        }
        return answer;
    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println(T.solution(str));
    }
}
