package codingtest._03_twopointers_slidingwindow;
import java.util.*;
// 연속 부분 수열 (two Pointers)
public class Main4 {
    public int solution(int n, int m, int[] arr) {
        int answer=0, sum=0, lt=0;
        for (int rt=0; rt<n; rt++) {
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m) {
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
