package package001;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue: first come first serve
		//enqueue add and dequeue remove
		// add =enqueue, offer()
		//remove= dequeue, poll()
		Queue<String> queue=new LinkedList<String>();
		queue.offer("Karen");
		queue.offer("Ranchoddas");
		queue.offer("Farhan");
		queue.offer("Raju");
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.poll();
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Raju"));
		
		//used in printer queue
		// used in linked list, priority queuesm breadth first search

		
	}

}
