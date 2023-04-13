package javabase.chap_12.clean;

// 나는 별다른 클래스를 상속할 필요 없어 하면 바로 Thread Class를 상속
public class CleanThread extends Thread {
    public void run () {
        System.out.println("-- 직원 청소 시작 (Thread) --");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원) " + i + "번방 청소 끝 (Thread) ");
        }
        System.out.println("-- 직원 청소 끝 (Thread) --");
    }


}
