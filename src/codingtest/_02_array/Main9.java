package codingtest._02_array;
import java.util.*;

// 격자판 최대합
public class Main9 {

    public int solution(int n, int[][] arr) {
        int answer=Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i=0; i<n; i++) {
            sum1=sum2=0;
            for (int j=0; j<n; j++) {
                sum1+=arr[i][j]; // i에 따른 가로축 합
                sum2+=arr[j][i]; // i에 따른 세로축 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for (int i=0; i<n; i++) {
            sum1+=arr[i][i]; // 오른쪽 방향 대각선 합
            sum2+=arr[i][n-i-1]; // 왼쪽 방향 대각선 합
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
