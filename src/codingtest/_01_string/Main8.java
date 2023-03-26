package codingtest._01_string;
import java.util.*;
// 팰린드롬
public class Main8 {

    public String solution(String str) {
        String answer="NO";
        str=str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(tmp.equalsIgnoreCase(str)) return "YES";
        return answer;
    }
    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
