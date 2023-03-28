package codingtest._03_twopointers_slidingwindow;

import java.util.*;
// 연속된 자연수의 합 (수학적으로 접근)
public class Main6 {
    public int solution(int n) {
        int answer=0;
        int cnt=1;
        n--; // 1을 빼고
        while(n>0) {
            cnt++; // 2를 빼고
            n=n-cnt; // ex) n=15일때 15-1-2=12
            if (n%cnt==0) answer++; // 12/cnt(2) 나머지가 0이면 ++
        }
        return answer;
    }
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}
