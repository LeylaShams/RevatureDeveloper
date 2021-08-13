package Day4;

import java.util.PriorityQueue;
public class PriorityQueueMethods {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Mark");
		queue.add("Paul");
        queue.add("Watson");
        queue.add("John");
        
        for (String name: queue) {
        	System.out.println(name);
        }
        
        System.out.println("Head: " + queue.element());
        System.out.println("Head: " + queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        
	}

}
