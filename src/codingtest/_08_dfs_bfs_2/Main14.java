package codingtest._08_dfs_bfs_2;

import java.util.*;
// 섬나라 아일랜드 (BFS로 풀기)
// BFS는 좌표 class 생성 필요
// 좌표를 queue에 넣어 진행 하는 방법을 기억하자

class P {
    public int x,y;
    public P(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class Main14 {
    int[] dx={-1,-1,-1,0,1,1,1,0};
    int[] dy={-1,0,1,1,1,0,-1,-1};
    static int n, answer=0;
    static int[][] board;

    public void BFS(int x, int y, int[][]board) {
        Queue<P> queue = new LinkedList<>();
        queue.offer(new P(x, y));
        while(!queue.isEmpty()) {
            P tmp=queue.poll();
            for (int i=0; i<n; i++) {
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
                    board[nx][ny]=0;
                    queue.offer(new P(nx, ny));
                }
            }
        }
    }
    public void solution(int[][] board) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j]==1) {
                    answer++;
                    board[i][j]=0;
                    BFS(i,j,board);
                }
            }
        }
    }
    public static void main(String[] args) {
        Main14 T = new Main14();
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
