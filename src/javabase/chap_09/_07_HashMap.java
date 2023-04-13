package javabase.chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (key,value)
        // 순서가 보장되지 않음을 인지하자
        // key값의 중복도 허용하지 않음

        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 5);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : " + map.size());

        System.out.println("-------------------");

        // 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석"));
        System.out.println("유재석님의 포인트 : " + map.get("박명수"));
        System.out.println("-------------------");

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트는 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("-------------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("-------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("-------------------");
        
        // 다시 고객들이 막 찾아옴 
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 5);
        map.put("서장훈", 15);
        
        // Key 확인 
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println("-------------------");

        for (int value: map.values()) {
            System.out.println(value);
        }
        System.out.println("-------------------");

        // Key & Value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "  포인트 : " + map.get(key));
        }
        System.out.println("-------------------");

        // 맵 : 중복 X, 순서 X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);

        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "  포인트 : " + map.get(key));
        }
        System.out.println("-------------------");

        // 순서를 보장 하고 싶은 경우

        HashMap<String, Integer> hashMap = new LinkedHashMap<>();

        hashMap.put("유재석", 10);
        hashMap.put("박명수", 5);
        hashMap.put("김종국", 5);
        hashMap.put("서장훈", 15);

        for (String key : hashMap.keySet()) {
            System.out.println("고객 이름 : " + key + "  포인트 : " + hashMap.get(key));
        }
        System.out.println("-------------------");
        
    }
}
