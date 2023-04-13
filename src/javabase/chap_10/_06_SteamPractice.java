package javabase.chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _06_SteamPractice {
    public static void main(String[] args) {

        // 스트림 예제 1: 필터링 후 새로운 데이터셋 만들기

        // List<String> list = new ArrayList<>(Arrays.asList("서울", "부산", "속초", "서울"));
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("속초");
        list.add("서울");

        System.out.println(list);
        List<String> result = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(result);

        System.out.println("list -> transformation -> set");
        // Set<String> set = list.stream().filter(x -> "서울".equals(x)).collect(Collectors.toSet());
        Set<String> set = list.stream().filter("서울"::equals).collect(Collectors.toSet());
        System.out.println(set);

        List<Integer> intlist = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> intResult = intlist.stream().filter(x -> x <=3).collect(Collectors.toList());
        System.out.println(intResult);
        Set<Integer> setResult = intlist.stream().filter(x -> x == 1).collect(Collectors.toSet());
        System.out.println(setResult);


        // 스트림 예제 2: Array를 Stream으로 변환
        String[] arr = {"엑셀보다 쉬운 SQL", "웹개발 종합반", "알고보면 알기쉬운 알고리즘", "웹개발의 봄,Spring"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(x -> System.out.println("수업명 : " + x));
        System.out.println();

        List<String> stringOfList =  Arrays.stream(arr).map(x -> "수업명" + x).collect(Collectors.toList());
        System.out.println(stringOfList);
        System.out.println();

        // 스트림 예제 3: reduce를 이용한 계산
        List<Integer> numArr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer numResult = numArr.stream().reduce(0,Integer::sum);
        System.out.println(numResult);

    }
}
