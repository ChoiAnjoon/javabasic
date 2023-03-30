package codingtest._04_hashmap;

import java.util.*;
// k번째 큰 수 (TreeSet) 중복이없고, 정렬되는 자료구조
public class Main5 {
    public int solution(int[] arr, int n, int k){
        int answer=0;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 기본은 오름차순이지만 내림차순으로 정렬
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int l=j+1; l<n; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for (int x: Tset) {
            cnt++;
            if(cnt==k) answer=x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}
