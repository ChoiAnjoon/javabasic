package codingtest._04_hashmap;
import java.util.*;
public class Main1 {
    public char solution(int n, String str) {
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char key: str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        int max=Integer.MIN_VALUE;
        for (char key: map.keySet()) {
            if(map.get(key)>max) {
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n, str));

    }
}
