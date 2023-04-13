package javabase.chap_08;

import javabase.chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution; // default
        // b1.price = 20000; // private
        // b1.color = "블랙"; // protected 자식클래스가 아니고 다른 패키지이기 때문에 접근 불가

    }
}
