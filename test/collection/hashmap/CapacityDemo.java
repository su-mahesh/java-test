package hashmap;

import java.util.HashMap;

public class CapacityDemo {
	static public final int i;
	
	static
    {
        i = 10;
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
		

		System.out.println(i);
	}

}
