package codingtest._02_array;

import java.util.*;
// 입력된 순서대로 등수구하기!
public class Main8 {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++) { // 하나 고정
            int cnt=1;
            for (int j=0; j<n; j++) {
                if (arr[j] > arr[i]) cnt++; // i 보다 j가 크면 +1 (등수추가)
            }
            answer[i]=cnt; // 추가한 등수 그 배열 자리에 넣어줌
        }
        return answer;
    }
    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] =sc.nextInt();
        for (int x: T.solution(n, arr)) System.out.print(x+" ");
    }
}
