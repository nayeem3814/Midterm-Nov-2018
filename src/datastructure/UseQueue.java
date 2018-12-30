package datastructure;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<String>();
		//Adding elements:
		queue.add("Dhaka");
		queue.add("Chitagong");
		queue.add("Sylhet");
		queue.add("Rajshai");
		queue.add("Comilla");
		System.out.println("Elements in Queue:"+queue);
		//removing first element by using remove() method:
		System.out.println("Removed element: "+queue.remove());
		//getting new top of the Queue by using element() method:
		System.out.println("New Top: "+queue.element());
		//by using poll() method we will get remove amd return head of Queue (if Queue is empty returns will be null):
		System.out.println("poll(): "+queue.poll());
		/* peek() method - it works same as element() method,
		 * however it returns null if the Queue is empty
		 */
		System.out.println("peek(): "+queue.peek());
		//Again displaying the elements of Queue
		System.out.println("Elements in Queue:"+queue);
	}
}