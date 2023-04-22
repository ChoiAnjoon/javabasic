package codingtest.dfs_bfs_1;

import java.util.*;
// 팩토리얼
public class Main3 {
    public int DFS(int n) {
        if (n==1) return 1 ;
        else return n*DFS(n-1);
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.DFS(n));
    }
}
