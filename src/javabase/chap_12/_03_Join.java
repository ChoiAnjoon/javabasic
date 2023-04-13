package javabase.chap_12;

import javabase.chap_12.clean.CleanRunnable;
import javabase.chap_12.clean.CleanThread;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        // join 메소드의 역할 : 스레드가 다 끝날때까지 기다리다, 다음 으로 넘어가게함
        try {
            thread.join(2500); // 2.5초 대기 그럼에도 Thread가 끝나지 않으면 넘어감
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
