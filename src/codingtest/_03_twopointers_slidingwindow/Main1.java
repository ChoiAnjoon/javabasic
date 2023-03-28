package codingtest._03_twopointers_slidingwindow;
import java.util.*;
// 두배열 합치기

public class Main1 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m) {
            if(a[p1]<b[p2]) answer.add(a[p1++]); // a[p1]이 작으면 담아주고 ++
            else answer.add(b[p2++]); // 둘이같거나 b[p2]가 작으면 담아주고 ++
        }
        while(p1<n) answer.add(a[p1++]); // a배열이 남아있다면 담아주고 p1++
        while(p2<m) answer.add(b[p2++]); // b배열이 남아있다면 담아주고 p2++
        return answer;
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
    }
}
