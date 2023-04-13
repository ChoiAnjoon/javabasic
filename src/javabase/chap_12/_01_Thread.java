package javabase.chap_12;

import javabase.chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 스레드
        // cleanBySelf();

        // 별도의 스레드를 만들면 여러가지 일을 동시에 한꺼번에 처리 가능
        CleanThread cleanThread = new CleanThread();
        // cleanThread.run(); // 직원 청소
        cleanThread.start();
        cleanByBoss(); // 사장님이 청소

    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
