package hashset;

import java.util.HashSet;
import java.util.Set;

public class OneBucketHashSet {

	
	
	public static void main(String[] args) {
		
		Set<Integer> s = new  HashSet<Integer>(1, 0.6f);
		
		s.add(12);
		s.add(5);
		s.add(51);
		s.add(45);
		s.add(52);
		s.add(56);
		
		System.out.println(s.contains(5));
	}
	
	
}
