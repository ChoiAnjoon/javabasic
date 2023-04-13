package javabase.chap_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class _Quiz_10 {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("서인혁", 32));
        list.add(new Customer("최안준", 32));
        list.add(new Customer("모니카", 32));
        list.add(new Customer("벤자민", 2));
        list.add(new Customer("제임스", 8));

        List<String> collect = list.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .collect(Collectors.toList());

        collect.stream().forEach(System.out::println);

    }
}
