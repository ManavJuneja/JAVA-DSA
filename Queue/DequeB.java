package Queue;

import java.util.*;

public class DequeB {
    public static void main(String[] args) {
    Deque<Integer>deque=new LinkedList<>();
    deque.addFirst(1);
    deque.addFirst(2);
    deque.addFirst(3);
    System.out.println(deque);
    deque.addLast(5);
    deque.addLast(6);
    System.out.println(deque);
    deque.removeFirst();
    deque.removeLast();
    System.out.println(deque);
    // System.out.println("First Element =";
    }
    
}
