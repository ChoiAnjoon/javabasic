package codingtest._08_dfs_bfs_2;

import java.util.*;
// 수열 추측하기 (DFS)

public class Main8 {
    static int n, f;
    static int[] p, b, ch;
    int[][] dy=new int[11][11];
    boolean flag=false;

    // 조합수 구하는 함수
    public int combi(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return dy[n][r]=1;
        else return dy[n][r]= combi(n-1, r-1) + combi(n-1, r);
    }

    // 순열 구하는 DFS (sum 누적 추가)
    public void DFS(int L, int sum) {
        if (flag) return; // flag가 true이면 잠자고 있는 모든 stackFrame 다 들어갔다 return
        if (L==n) {
            if (sum==f) {
                for (int x:p) System.out.print(x+" ");
                flag=true; // 조건에 맞는 순열을 찾았으면 true
            }
        }
        else {
            for (int i=1; i<=n; i++) {
                if (ch[i]==0) {
                    ch[i]=1;
                    p[L]=i;
                    DFS(L+1, sum+(p[L]*b[L]));
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        f=sc.nextInt();
        p=new int[n];
        b=new int[n];
        ch=new int[n+1];
        for (int i=0; i<n; i++) {
            b[i]=T.combi(n-1,i);
        }
        T.DFS(0,0);
    }
}
