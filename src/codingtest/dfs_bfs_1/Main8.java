package codingtest.dfs_bfs_1;
import java.util.*;
// 송아지 찾기 (BFS: 상태트리탐색)
public class Main8 {
    int[] ch;
    int[] dis = {1,-1,5};
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        int answer=0;
        ch = new int[10001];
        ch[s]=1;
        Q.offer(s);
        int L=0;
        while(!Q.isEmpty()) {
            int len=Q.size();
            for (int i=0; i<len; i++) {
                int x=Q.poll();
                if (x==e) return L;
                for (int j=0; j<3; j++) {
                    int nx=x+dis[j];
                    if(nx>=1 && nx<=10000 && ch[nx]==0) {
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int e=kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
