package hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMap {

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
	private static Map<String, Integer> sortByValueBubleSort(HashMap<String, Integer> hm) {

		/*
		 * Map<String, Integer> tm = new TreeMap(new Comparator<String>() {
		 * 
		 * });
		 * 
		 * tm.putAll(hm); return tm;
		 */
		return null;
	}
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		hm.put("Baaa", 1);
		hm.put("0", 100);

		System.out.println(hm);
		Map<String, Integer> hm1 = sortByValue(hm);
		System.out.println("sorted -> " + hm1);
		Map<String, Integer> hm2 = sortByValueBubleSort(hm);
		System.out.println("sorted -> " + hm2);

	}

	

}
