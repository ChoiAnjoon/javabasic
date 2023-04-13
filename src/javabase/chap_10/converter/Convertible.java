package javabase.chap_10.converter;

@FunctionalInterface // 이 인터페이스는 함수형 인터페이스로 쓸것이라는 것을 컴파일러에 알려주는 annotation
public interface Convertible {
    void convert (int USD);
}
