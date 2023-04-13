package codingtest._06_sorting_searching;
import java.util.*;
// 중복확인
public class Main5 {
    public String solution(int n, int[] arr) {
        String answer="U";
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            if(arr[i]==arr[i+1]) return "D";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
