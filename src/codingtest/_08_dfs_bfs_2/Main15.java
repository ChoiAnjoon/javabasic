package codingtest._08_dfs_bfs_2;

import java.util.*;
// 피자 배달 거리 (DFS활용)

class PP {
    public int x,y;
    public PP(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
public class Main15 {
    static ArrayList<PP> home, pizza;
    static int n, m, len, answer=Integer.MAX_VALUE;
    static int[] combi;
    public void DFS(int L, int s) {
        if (L==m) {
            // 하나의 조합이 완성되고
            // 각 집의 피자배달 거리의 최소값을 합친
            // 도시의 피자 배달 거리의 총합 이 sum
            int sum=0;
            for (PP h: home) {
                int dis=Integer.MAX_VALUE;
                for (int i: combi) {
                    dis = Math.min(dis, Math.abs(h.x-pizza.get(i).x) + Math.abs(h.y-pizza.get(i).y));
                }
                sum+=dis;
            }
            // 조합 별 도시의 피자 배달 거리의 총합 최소인 것을 구함.
            answer=Math.min(answer, sum);
        }
        else {
            // s는 0 인덱스로 시작 해서 len 6 까지 --> 총 6개
            // 6개의 피자집중에서 4개를 뽑는 조합 구하기 조합은 위의 if 문에서
            // m 즉 level이 4가 될때 끊어줌으로 6개중 4개를 선택한 피자집 index 조합을 만듬
            for (int i=s; i<len; i++) {
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main15 T = new Main15();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int tmp=sc.nextInt();
                if(tmp==1) home.add(new PP(i,j));
                else if(tmp==2) pizza.add(new PP(i,j));
            }
        }
        len=pizza.size();
        combi=new int[m];
        T.DFS(0,0);  // len C m --> index 값으로 조합을 구함 (즉 6개의 피자집중 4개를 선택 인덱스로)
        System.out.println(answer);
    }
}
