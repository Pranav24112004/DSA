package package001;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class priorityqueue003 {

	public static void main(String[] args) {
		// fifo
		// if we want to reverse it is ascending and now descending
		// Queue<Double> queue=new PriorityQueue<>(Collections.reverseOrder());
		Queue<String> queue=new PriorityQueue<String>();
		queue.offer("A");
		queue.offer("C");
		queue.offer("B");
		queue.offer("D");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
