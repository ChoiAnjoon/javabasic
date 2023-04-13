package javabase.chap_09;

import java.util.ArrayDeque;

public class _10_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        // addFirst와 비슷하지만 큐의 크기 문제가 생길 때, offerFirst는 false를, addFirst는 exception을 반환
        arrayDeque.offerFirst(10);
        System.out.println(arrayDeque);
        arrayDeque.offerLast(-1);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println();

        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.size());







    }
}
