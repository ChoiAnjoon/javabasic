package codingtest._08_dfs_bfs_2;

import java.util.*;
// 미로의 최단거리 통로 찾기(BFS)

// queue에 들어갈 좌표 클래스 생성
class Point {
    public int x,y;
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
public class Main11 {
    static int[][] board, dis;
    int[] dx= {-1,0,1,0};
    int[] dy= {0,1,0,-1};

    public void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        board[x][y]=1; // checking
        while(!queue.isEmpty()) {
            Point tmp=queue.poll();
            for (int i=0; i<4; i++) {
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }

    }
    public static void main(String[] args) {
        Main11 T = new Main11();
        Scanner sc = new Scanner(System.in);
        board=new int[8][8];
        dis=new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                board[i][j]=sc.nextInt();
            }
        }
        T.BFS(1,1);
        if (dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
