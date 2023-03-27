package codingtest._02_array;

import java.util.*;
// 큰수 출력하기 (자신의 앞수보다 큰 수 출력)
public class Main1 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1; i<n; i++) {
            if (arr[i-1]<arr[i]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i]=sc.nextInt();
        for (int x: T.solution(n, arr)) System.out.print(x + " ");
    }
}
