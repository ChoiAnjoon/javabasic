package codingtest.dfs_bfs_1;
import java.util.*;
// 피보나치수열 (DFS)
public class Main4 {

    // 방법1 (default)
//    public int DFS(int n) {
//        if (n==1) return 1;
//        else if (n==2) return 1;
//        else return DFS(n-2) + DFS(n-1);
//    }
//    public static void main(String[] args) {
//        Main4 T = new Main4();
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1; i<=n; i++) System.out.print(T.DFS(i) + " ");


//    // 방법2 (메모이제이션 활용 X)
//    static int[] fibo;
//    public int DFS(int n) {
//        if (n==1) return fibo[n]=1;
//        else if (n==2) return fibo[n]=1;
//        else return fibo[n]=DFS(n-2) + DFS(n-1);
//    }
//    public static void main(String[] args) {
//        Main4 T = new Main4();
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        fibo = new int[n+1];
//        T.DFS(n);
//        for (int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
//    }

    // 방법3 --> 메모이제이션 활용
static int[] fibo;
    public int DFS(int n) {
        if (fibo[n]>0) return fibo[n];
        if (n==1) return fibo[n]=1;
        else if (n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2) + DFS(n-1);
    }
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fibo = new int[n+1];
        T.DFS(n);
        for (int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}
