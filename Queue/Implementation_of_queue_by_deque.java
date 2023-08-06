package Queue;
import java.util.*;
public class Implementation_of_queue_by_deque{
static class Queue{
        Deque<Integer>de=new LinkedList<>();
        public void add(int data){
            de.addLast(data);
        }
        public void remove(){
            de.removeFirst();
        }
        public int peek(){
            return de.getFirst();
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
    }
}