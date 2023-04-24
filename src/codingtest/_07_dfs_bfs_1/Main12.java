package codingtest._07_dfs_bfs_1;

import java.util.*;
// 경로 탐색 (ArrayList(인접리스트) 활용 : DFS)

public class Main12 {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v==n) answer++;
        else {
            for (int nx :graph.get(v)) {
                if (ch[nx]==0) {
                    ch[nx]=1;
                    DFS(nx);
                    ch[nx]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i=0; i<m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);
        }
        ch=new int[n+1];
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}
