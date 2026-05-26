package org.benf.cfr.tests;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecordPattern6 {
    record Node(int value, Node next) {}

    static int sumWhile(Node head) {
        int total = 0;
        Node cur = head;
        while (cur instanceof Node(int v, Node next)) {
            total += v;
            cur = next;
        }
        return total;
    }

    static int countViaDeque(Deque<Object> q) {
        int count = 0;
        while (!q.isEmpty() && q.peek() instanceof Node(int v, Node n)) {
            count += v;
            q.poll();
        }
        return count;
    }

    public static void main(String[] args) {
        Node tail = new Node(3, null);
        Node mid = new Node(2, tail);
        Node head = new Node(1, mid);
        System.out.println(sumWhile(head));
        System.out.println(sumWhile(null));

        Deque<Object> q = new ArrayDeque<>();
        q.add(new Node(10, null));
        q.add(new Node(20, null));
        q.add("stop");
        q.add(new Node(30, null));
        System.out.println(countViaDeque(q));
    }
}
