package codingtest._08_dfs_bfs_2;

import java.util.*;
// 섬나라 아일랜드 (DFS로 풀기)
public class Main13 {
    static int n, answer=0;
    int[] dx={-1,-1,-1,0,1,1,1,0};
    int[] dy={-1,0,1,1,1,0,-1,-1};
    static int[][] board;

    public void DFS(int x, int y, int[][] board) {
        for (int i=0; i<8; i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if (nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
                board[nx][ny]=0;
                DFS(nx,ny,board);
            }
        }
    }
    public void solution(int[][] board) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(board[i][j]==1) {
                    answer++;
                    board[i][j]=0; // DFS돌리기 전 i,j를 0으로 checking
                    DFS(i,j,board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        board=new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j]=sc.nextInt();
            }
        }
        T.solution(board);
        System.out.println(answer);
    }
}
