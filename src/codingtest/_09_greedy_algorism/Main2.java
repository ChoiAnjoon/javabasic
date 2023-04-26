package codingtest._09_greedy_algorism;
import java.util.*;
// 회의실 배정

class Time implements Comparable<Time> {
    public int st, et;
    public Time(int st, int et) {
        this.st=st;
        this.et=et;
    }
    @Override
    public int compareTo(Time o) {
        // endtime이 같으면 starttime 기준으로 오름차순 정렬
        if (this.et==o.et) return this.st-o.st;
        // 그게 아니라면 기본 endtime 기준으로 오름차순 정렬
        else return this.et-o.et;
    }
}

public class Main2 {
    public int solution(ArrayList<Time> arr, int n) {
        int cnt=0;
        Collections.sort(arr);
        int et=0;
        for (Time ob: arr) {
            if(ob.st>=et) {
                cnt++;
                et=ob.et;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<>();
        int n=sc.nextInt();
        for (int i=0; i<n; i++) {
            int st=sc.nextInt();
            int et=sc.nextInt();
            arr.add(new Time(st,et));
        }
        System.out.println(T.solution(arr,n));
    }
}
