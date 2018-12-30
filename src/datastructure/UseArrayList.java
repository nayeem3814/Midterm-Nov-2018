package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
public class UseArrayList {
	public static void main(String[] args) {
		/* Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.  */
		ArrayList<String> array = new ArrayList<String>();
		array.add("Dhaka");
		array.add("Chitagong");
		array.add("Rajshahi");
		array.add("Comilla");
		System.out.println("All the dist. after adding: " + array);
		System.out.println("......................... ");
		System.out.println("Getting dist. name using while loop with Iterator: ");
		Iterator itr = array.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		array.remove("Comilla");
		System.out.println("...........................");
		System.out.println("Dist name after removing last one: " + array);
		System.out.println("......................... ");
		System.out.println("Getting dist. name using For Each loop:");
		for (String st : array) {
			System.out.println(st);
		}
	}
}