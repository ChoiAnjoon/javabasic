package codingtest._09_greedy_algorism;
import java.util.*;
// 씨름 선수

class Body implements Comparable<Body>{
    public int h,w;
    public Body(int h, int w) {
        this.h=h;
        this.w=w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h-this.h; // 키순으로 내림차순 정렬
    }
}
public class Main1 {
    public int solution(ArrayList<Body> arr, int n) {
        int cnt=0;
        Collections.sort(arr);
        int max =Integer.MIN_VALUE;
        for (Body ob: arr) {
            if (ob.w>max) {
                max=ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        ArrayList<Body> arr = new ArrayList<>();
        int n=sc.nextInt();
        for (int i=0; i<n; i++) {
            int h=sc.nextInt();
            int w=sc.nextInt();
            arr.add(new Body(h,w));
        }
        System.out.println(T.solution(arr, n));
    }
}
