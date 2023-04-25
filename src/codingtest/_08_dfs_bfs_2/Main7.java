package codingtest._08_dfs_bfs_2;

import java.util.*;
// 조합의 경우수(메모이제이션) (공식활용 DFS)
public class Main7 {
    int[][] dy=new int[35][35];
    public int DFS(int n, int r) {
        if (dy[n][r]>0) return dy[n][r];
        if (n==r || r==0) return dy[n][r]=1;
        else return dy[n][r]=DFS(n-1, r-1) + DFS(n-1, r);
    }
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
