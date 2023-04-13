package javabase.chap_09;

import java.util.LinkedList;
import java.util.Queue;

public class _09_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        queue.add(7);
        queue.add(11);
        queue.add(9);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
