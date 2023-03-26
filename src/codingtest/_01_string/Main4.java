package codingtest._01_string;
import java.util.*;
// 단어 뒤집기
// 방법 1. StringBuilder 사용
// 방법 2. 손코딩

public class Main4 {
//    public ArrayList<String> solution(int n, String[] strArr) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x: strArr) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }
    public ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x: strArr) {
            char[] chArr = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt) {
                char tmp=chArr[lt];
                chArr[lt]=chArr[rt];
                chArr[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chArr); // char 배열을 String 으로 형변환
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i=0; i<n; i++) strArr[i]=sc.next();
        for (String x: T.solution(n, strArr)) System.out.println(x);
    }
}
