package codingtest.dfs_bfs_1;
import java.util.*;
// 부분집합 구하기
public class Main6 {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if (L==n+1) {
            for (int i=1; i<=n; i++) {
                if(ch[i]==1) System.out.print(i+" ");
            }
            System.out.println();
        }
        else {
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }

    }
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ch=new int[n+1];
        T.DFS(1);
    }
}
