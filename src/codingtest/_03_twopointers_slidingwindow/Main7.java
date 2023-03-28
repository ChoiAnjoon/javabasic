package codingtest._03_twopointers_slidingwindow;
import java.util.*;
// 최대 길이 연속부분수열 (two pointers)
public class Main7 {
    public int solution(int n, int k, int[] arr) {
        int answer=0, cnt=0, lt=0;
        for (int rt=0; rt<n; rt++) {
            if(arr[rt]==0) cnt++;
            while(cnt>k) {
                if(arr[lt]==0) cnt--;
                lt++; // 잊지말자 lt++시켜줘야함
            }
            answer= Math.max(answer, rt-lt+1);
            // 1로 연속된 수열의 길이를 구하는 공식 rt-lt+1 기억하자
        }



        return answer;
    }
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
