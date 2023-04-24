package codingtest._08_dfs_bfs_2;
import javabase.chap_11.quiz12.Main;

import java.util.*;
// 최대점수 구하기(DFS)

// 1번 내풀이
//public class Main3 {
//    static int n, c, answer=0;
//    static int[] score, time;
//
//    public void DFS(int L, int sumScore, int timeScore) {
//        if (timeScore>c) return;
//        if (L==n) {
//            answer=Math.max(answer, sumScore);
//        }
//        else {
//            DFS(L+1, sumScore+score[L], timeScore+time[L]);
//            DFS(L+1,sumScore,timeScore);
//        }
//    }
//
//    public static void main(String[] args) {
//        Main3 T = new Main3();
//        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
//        c=sc.nextInt();
//        score=new int[n];
//        time=new int[n];
//        for (int i=0; i<n; i++) {
//            score[i]=sc.nextInt();
//            time[i]=sc.nextInt();
//        }
//        T.DFS(0,0,0);
//        System.out.println(answer);
//    }
//}

// 다른 사람 풀이
public class Main3 {

    static int n,m,answer=Integer.MIN_VALUE;
    public void DFS(int L, int score, int time, int[] ps, int[] pt) {
        if (time>m) return;
        if (L==n) {
            answer=Math.max(answer, score);
        }
        else {
            DFS(L+1, score+ps[L], time+pt[L], ps, pt);
            DFS(L+1, score, time, ps, pt);
        }
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);
    }
}
