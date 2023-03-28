package codingtest._02_array;

import java.util.*;
// 임시반장 정하기 (문제를 보며 파악을 해야한다)
// 3중 for문
public class Main11 {

    public int solution(int n, int[][] arr) {
        int answer=0, max=Integer.MIN_VALUE;
        for (int i=1; i<=n; i++) { // i학생 고정
            int cnt=0;
            for (int j=1; j<=n; j++) { // 1~5번 학생 for문 (세로축)
                for (int k=1; k<=n; k++) { // 1~5까지 학년 for문 (가로축)
                    if (arr[i][k]==arr[j][k]) { // 고정된 i번째 학생과 1~5번째의 j번째 학생과의 같은반 여부 확인
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt>max) {
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main11 T = new Main11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
