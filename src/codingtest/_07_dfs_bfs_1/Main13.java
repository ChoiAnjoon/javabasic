package codingtest._07_dfs_bfs_1;

import java.util.*;
// 그래프 최단거리 (BFS)
public class Main13 {
    static int n,m;
    static int[] ch, dist;
    static ArrayList<ArrayList<Integer>> graph;
    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v]=1;
        dist[v]=0;
        queue.offer(v);
        while(!queue.isEmpty()) {
            int cv=queue.poll();
            for (int nx: graph.get(cv)) {
                if(ch[nx]==0) {
                    ch[nx]=1;
                    queue.offer(nx);
                    dist[nx]=dist[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        ch=new int[n+1];
        dist= new int[n+1];
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i=0; i<m; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i + " : " + dist[i]);
        }
    }
}
