package javabase.chap_09.coffee;

import javabase.chap_09.user.User;

// 유저클래스 또는 유저클래스를 상속받은 클래스만을 받을 수 있음
// 어떤형태의 타입을 쓰건 상관없는데 반드시 User 라는 클래스를 상속하는 T를 써야 한다 라는 의미
public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
