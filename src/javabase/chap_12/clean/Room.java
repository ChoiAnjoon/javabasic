package javabase.chap_12.clean;

public class Room {
    public int number = 1;

    // 메소드 동기화
    // 직원1 스레드가 여기와서 청소 하고 있는 동안에
    // 직원2 는 직원1이 끝날때까지 대기 하다가 그 후 에 메소드 접근
    synchronized public void clean(String name) {
        // 직원1 : 3번방 청소 중
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
