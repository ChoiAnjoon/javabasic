package codingtest._01_string;
import java.util.*;
// 특정 문자 뒤집기
public class Main5 {

    public String solution(String str) {
        String answer;
        char[] chArr = str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(chArr[lt])) lt++;
            else if(!Character.isAlphabetic(chArr[rt])) rt--;
            else {
                char tmp=chArr[lt];
                chArr[lt]=chArr[rt];
                chArr[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chArr);
        return answer;
    }

    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(T.solution(str));
    }
}
