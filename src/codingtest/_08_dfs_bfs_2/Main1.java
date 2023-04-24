package codingtest._08_dfs_bfs_2;

import java.util.*;
// 합이 같은 부분집합 (DFS: 아마존 인터뷰)

public class Main1 {

    static String answer="NO";
    static int n, total;
    boolean flag=false;
    public void DFS(int L, int sum, int[] arr) {
        if (flag) return; // 밑에서 합이 같은 부분집합을 찾았기 때문에 그냥 그 뒤의 stackframe 다 return
        if (sum > total/2) return; // 애초에 total의 절반 보다 sum이 크다면 return
        if (L==n) {
            if ((total-sum)==sum) {
                answer="YES";
                flag=true;
            }
        }
        else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
