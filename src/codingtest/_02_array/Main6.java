package codingtest._02_array;

import java.util.*;
// 뒤집은 소수
public class Main6 {

    public boolean isPrime(int num) {
        // 소수인지 아닌지 식별
        if(num==1) return false;
        for (int i=2; i<num; i++) {
            if (num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 숫자 뒤집기
        // for문으로 돌려도 됨
        for (int x: arr) { // for (int i=0; i<n; i++) {
            int tmp = x; // int tmp = arr[i];
            int res = 0;
            while(tmp>0) {
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
