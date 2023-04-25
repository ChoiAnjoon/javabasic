package codingtest._08_dfs_bfs_2;

import java.util.*;
// 조합 구하기 --> 이것은 그냥 외워 놓는 것이 좋을 것 같다.
public class Main9 {

    static int n,m;
    static int[] combi;
    public void DFS(int L, int s) { // 조합 구하는 이 함수채로 외우자
        if (L==m) {
            for (int x: combi) System.out.println(x+" ");
            System.out.println();
        }
        else {
            for (int i=s; i<=n; i++) {
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        combi=new int[m];
        T.DFS(0,1);
    }
}
