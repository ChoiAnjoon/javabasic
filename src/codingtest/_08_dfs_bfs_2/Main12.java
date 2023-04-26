package codingtest._08_dfs_bfs_2;

import java.util.*;
// 토마토(BFS 활용)

// 토마토의 좌표를 기록하는 class 생성
class Dot {
    public int x,y;
    public Dot(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class Main12 {
    static int[][] board, dis;
    static int n,m;
    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};
    static Queue<Dot> queue = new LinkedList<>();
    public void BFS() {
        while(!queue.isEmpty()) {
            Dot tmp=queue.poll();
            for (int i=0; i<4; i++) {
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    queue.offer(new Dot(nx,ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        dis = new int[n][m];
        board = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                board[i][j]=sc.nextInt();
                // 익은 토마토 (1) 가 board에 있으면 그 좌표를 queue에 넣어준다.
                if(board[i][j]==1) queue.offer(new Dot(i,j));
            }
        }
        T.BFS();

        // BFS를 다 돌고 결과 board 배열을
        // 탐색했을시 0 즉, 익지않은 토마토가 있다면 -1을 출력
        boolean flag=true;
        int answer=Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if(board[i][j]==0) flag=false;
            }
        }
        // 그렇지 않다면 board에 0이 발견 되지 않았을시
        // 토마토의 익은 날수를 기록해 놓은 dis 배열의 최대값을 출력
        // 즉, 토마토 창고의 토마토가 모두 익은 최소의 날짜를 출력 하는 꼴이 된다.
        if (flag) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    answer=Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}
