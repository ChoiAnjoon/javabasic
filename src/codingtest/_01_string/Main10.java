package codingtest._01_string;

import java.util.*;
// 가장 짧은 문자거리
// 앞으로 for문 돌고, 뒤로 for문 돌아서 min값을 비교
public class Main10 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p=1000;
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i)==c) {
                p=0;
                answer[i]=p;
            }
            else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i)==c) {
                p=0;
            }
            else {
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x: T.solution(str, c)) System.out.print(x + " ");

    }
}
