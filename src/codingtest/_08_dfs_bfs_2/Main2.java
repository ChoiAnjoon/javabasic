package codingtest._08_dfs_bfs_2;
import java.util.*;
// 바둑이 승차 (DFS 문제)
public class Main2 {

    static int n, c, answer=0;
    public void DFS(int L, int sum, int[] arr) {
        if (sum>c) return;
        if (L==n) {
            answer=Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        c=sc.nextInt();
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
