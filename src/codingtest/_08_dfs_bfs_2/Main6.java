package codingtest._08_dfs_bfs_2;

import java.util.*;
// 순열구하기 (중복 X) DFS
public class Main6 {
    static int n, m;
    static int[] arr, pm, ch;
    public void DFS(int L) {
        if(L==m) {
            for (int x: pm) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for (int i=0; i<n; i++) {
                if(ch[i]==0) {
                    ch[i]=1;
                    pm[L]=arr[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n];
        for (int i=0; i<n; i++) arr[i]=sc.nextInt();
        pm=new int[m];
        ch=new int[n];
        T.DFS(0);
    }
}
