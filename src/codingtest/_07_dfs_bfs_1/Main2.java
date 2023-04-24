package codingtest._07_dfs_bfs_1;
import java.util.*;

// 2진수 출력
public class Main2 {
    public void DFS(int n) {
        if (n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        T.DFS(n);
    }
}
