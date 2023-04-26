package codingtest._09_greedy_algorism;

import java.util.*;
// 결혼식

class Marry implements Comparable<Marry>{
    public int time;
    public char status;
    public Marry(int time, char status) {
        this.time=time;
        this.status=status;
    }
    @Override
    public int compareTo(Marry ob) {
        if(this.time==ob.time) return this.status-ob.status;
        else return this.time-ob.time;
    }
}

public class Main3 {
    public int solution(ArrayList<Marry> arr) {
        int cnt=0, answer=Integer.MIN_VALUE;
        Collections.sort(arr);
        for (Marry ob: arr) {
            if (ob.status=='s') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        ArrayList<Marry> arr = new ArrayList<>();
        int n= sc.nextInt();
        for (int i=0; i<n; i++) {
            int st=sc.nextInt();
            int et=sc.nextInt();
            arr.add(new Marry(st,'s'));
            arr.add(new Marry(et,'e'));
        }
        System.out.println(T.solution(arr));
    }
}
