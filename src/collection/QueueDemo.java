package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.element());            //return head element
        System.out.println(queue.peek());               //return head element
        System.out.println(queue.offer(50));       //adding element then condition mention like true or false
       System.out.println(queue.poll());              // remove the element then return null
      System.out.println(queue.remove());            // remove the element then return exception
      System.out.println(queue);

    }
}
