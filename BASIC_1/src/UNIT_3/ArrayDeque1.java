package UNIT_3;

import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("1st");
        dq.add("2nd");
        dq.addFirst("3rd");
        dq.addLast("4th");
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq);

    }

}
