package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	private static void mergeExample() {
		// create a HashMap and add some values
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "L");
		map1.put(2, "M");
		map1.put(3, "N");

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "B");
		map2.put(2, "G");
		map2.put(3, "R");

		// print map details
		System.out.println("HashMap1: " + map1.toString());

		System.out.println("HashMap2: " + map2.toString());

		// provide value for new key which is absent
		// using computeIfAbsent method
		map2.forEach((key, value) -> 
		map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));

		// print new mapping
		System.out.println("New HashMap: " + map1);
	}

	public static void computeExample() {
		// Create a Map and add some values
		Map<String, Integer> map = new HashMap<>();
		map.put("Key1", 12);
		map.put("Key2", 15);
		map.put(null, 15);

		// print map details
		System.out.println("Map: " + map);

		// remap the values
		// using compute method
		map.compute("Key1", (key, val) -> (val == null) ? 1 : val + 1);
		map.compute(null, (key, val) -> (val == null) ? 1 : val + 5);
		map.computeIfAbsent("key5", k -> 2000 + 33000);

		map.computeIfPresent("Key1", (key, val) -> 100);

		// print new mapping
		System.out.println("New Map: " + map);
	}

	private static void oldStyle() {
		Map map = new HashMap();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map

		Set set = map.entrySet();// Converting to Set so that we can traverse

		for (var i : set) {
			var s = (Map.Entry) i;
			System.out.println(s.getKey() + " " + s.getValue());
		}
		Iterator itr = set.iterator();
		/*
		 * while(itr.hasNext()){ //Converting to Map.Entry so that we can get key and
		 * value separately Map.Entry entry=(Map.Entry)itr.next();
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
	}

	private static void newStyle() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		// Elements can traverse in any order
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.println(8 == 010);
		mergeExample();
	}

}
