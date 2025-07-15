package Ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class Lab_258_QUEUE {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
