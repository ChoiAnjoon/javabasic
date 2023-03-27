package codingtest._02_array;
import java.util.*;
// 소수찾기(에라토스네테스 체)
public class Main5 {
    public int solution(int n) {
        int answer=0;
        int[] arr = new int[n+1];
        for (int i=2; i<=n; i++) {
            if (arr[i]==0) {
                answer++;
                for (int j=i; j<=n; j=j+i) arr[j]=1; // 소수의 배수를 1로 채움
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));
    }
}
