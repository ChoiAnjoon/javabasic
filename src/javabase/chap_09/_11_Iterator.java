package javabase.chap_09;

import java.util.*;

public class _11_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
//        List<String> list2 = new ArrayList<>(Arrays.asList("유재석", "김종국"));
//        System.out.println(list2);
        list.add("유재석");
        list.add("(알수없음)");
        list.add("김종국");
        list.add("(알수없음)");
        list.add("강호동");
        list.add("(알수없음)");
        list.add("박명수");
        list.add("(알수없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // hasNext() 다음에 가져올 데이터가 있는지를 반환 있으면 true, 없으면 false
            System.out.println(it.next());
        }

        System.out.println("----------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알수없음)")) {
                it.remove(); // 삭제
            }
        }


        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // hasNext() 다음에 가져올 데이터가 있는지를 반환 있으면 true, 없으면 false
            System.out.println(it.next());
        }

        System.out.println("----------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("----------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator(); -> 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator(); // Ctrl + Alt + V 로 자동생성 할 수 있음.

        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("----------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("----------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }



    }
}
