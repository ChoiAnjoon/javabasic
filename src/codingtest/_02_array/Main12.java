package codingtest._02_array;

import java.util.*;
// 멘토링 (4중 for문)
public class Main12 {
    public int solution(int n, int m, int[][] arr) {
        int answer=0;
        for (int i=1; i<=n; i++) { // 학생 i와 j의 경우의 수를 모조리 뽑음
            for (int j=1; j<=n; j++) {
                int cnt=0;
                for (int k=0; k<m; k++) { // 0~2까지의 시험
                    int pi=0, pj=0;
                    for (int s=0; s<n; s++) { // 0~3까지의 등수
                        if (arr[k][s]==i) pi=s; // k 번째 시험일때 학생 i의 등수는 s(s는 x축 인덱스값==등수)
                        if (arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}
