package codingtest.dfs_bfs_1;

import java.util.*;
// 경로 탐색(인접행렬: DFS)
public class Main11 {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if (v==n) answer++;
        else {
            for (int i=1; i<=n; i++) {
                if (graph[v][i]==1 && ch[i]==0) {
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main11 T = new Main11();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph = new int[n+1][n+1];
        for (int i=0; i<m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
        }
        ch=new int[n+1];
        ch[1]=1; // DFS(1) 실행전에 1을 사용한다고 check 배열에 표시
        T.DFS(1);
        System.out.println(answer);
    }
}
