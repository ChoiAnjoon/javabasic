package javabase.chap_10;

import javabase.chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(3);

        // convertUSD(converter, 2);

        // 위에서는 converter를 객채로 생성해서 넣어 주었지만
        // 이곳은 converter 자체를 람다식으로 정의해서 넣어줌
        // convertUSD(((USD) -> System.out.println(USD + " 달러 : " + (USD * 1400) + " 월")), 2);

        // 함수형 인터페이스
        // 함수형 인터페이스를 이용하기 위해서는 인터페이스에는 딱하나의 추상 메소드가 존재해야하는 조건이 있다.
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 : " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400원");
        c1.convert();

        // 두줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 월");
        };
        c1.convert();

        // 전달 값이 두개일때
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 월");
        c2.convert(10, 1400);

        // 반환 값이 있는 경우
        // ConvertibleWithReturn c3 = (d, w) -> {return d * w};
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");

    }

    public static void convertUSD (Convertible converter, int USD) {
        converter.convert(USD);
    }
}
