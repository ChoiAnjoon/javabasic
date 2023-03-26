package codingtest._01_string;
import java.util.*;
// 문장 속 단어 (1. indexOf와 substring을 이용 / 2. split이용)
public class Main3 {
//    public String solution(String str) {
//        String answer="";
//        int m=Integer.MIN_VALUE, pos;
//        while((pos=str.indexOf(' '))!=-1) {
//            String tmp=str.substring(0,pos);
//            int len=str.length();
//            if (len>m) {
//                len=m;
//                answer=tmp;
//            }
//            str=str.substring(pos+1);
//        }
//        if(str.length()>m) answer=str;
//        return answer;
//    }
    public String solution (String str) {
        String answer="";
        int m=Integer.MIN_VALUE;
        String[] strArr = str.split(" ");
        for (String x: strArr) {
            int len = x.length();
            if (len>m) {
                len=m;
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
