package datastructure;
import java.util.*;
public class UseMap {
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> Flowers = new ArrayList<>();
		Flowers.add("Golap");
		Flowers.add("Shefali");
		List<String> Fish = new ArrayList<>();
		Fish.add("Elish");
		Fish.add("Telapiya");
		List<String> Birds = new ArrayList<>();
		Birds.add("Tiya");
		Birds.add("Chorui");
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("Comon Flowers of Bd",Flowers);
		list.put("Comon Fishes of Bd", Fish);
		list.put("Comon Birds of Bd",Birds);
		System.out.println(list);
		System.out.println(" ");
		System.out.println("Getting values by using for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " --------> " +st.getValue());
		}
		System.out.println(" ");
		System.out.println("Getting values by  using iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
