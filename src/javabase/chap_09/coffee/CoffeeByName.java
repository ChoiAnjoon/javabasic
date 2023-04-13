package javabase.chap_09.coffee;

public class CoffeeByName {
    public Object name; // Integer, Double, String, BlackBox

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피준비 완료 : " + name);
    }
}
