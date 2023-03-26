package codingtest._01_string;
import java.util.*;
// 회문문자열 (2가지 방법)
public class Main7 {
//    public String solution(String str) {
//        String answer="NO";
//        String tmp = new StringBuilder(str).reverse().toString();
//        if(tmp.equalsIgnoreCase(str)) return "YES";
//        return answer;
//    }

    public String solution (String str) {
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for (int i=0; i<len/2; i++) {
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
