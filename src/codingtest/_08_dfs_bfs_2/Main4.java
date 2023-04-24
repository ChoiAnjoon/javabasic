package codingtest._08_dfs_bfs_2;

import java.util.*;
// 중복순열 구하기(DFS)
public class Main4 {
    static int n,m;
    static int[] pm;
    public void DFS(int L) {
        if (L==m) {
            for (int x: pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i=1; i<=n; i++) {
                pm[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        pm=new int[m];
        T.DFS(0);
    }
}
