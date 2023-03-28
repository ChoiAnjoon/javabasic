package codingtest._02_array;

import java.util.*;
// 봉우리찾기
public class Main10 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean flag=true;
                for (int k=0; k<4; k++) {
                    int nx= i+dx[k]; // i를 더해 줘야하는 것을 잊지말아야 한다.
                    int ny= j+dy[k]; // j를 더해 줘야하는 것을 잊지말아야 한다.
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
                        flag=false;
                        break; // 주변 4개중 하나라도 현재 위치의 봉우리 (arr[i][j]) 보다 크거나 같으면
                        // 봉우리가 아니기 때문에 break로 for문을 나가준다.
                    }
                }
                if (flag) answer++; // 위의 4개를 돌았는데 flag가 false가 아니라면
                // 봉우리이기 때문에 cnt 해준다.
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
