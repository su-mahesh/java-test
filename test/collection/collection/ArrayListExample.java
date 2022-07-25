package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;


public class ArrayListExample {

	public static void IntegerArrayToArrayList() {
		Integer[] arr = new Integer[] { 1, 2, 3 };

		ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));

		lst.add(4);
		System.out.println(lst);

	}

	public static void example() {
		// array to list
		Integer[] spam = new Integer[] { 1, 2, 3 };
		int[] spam1 = new int[] { 1, 2, 3 };

		List<Integer> intlist = Arrays.asList(spam);

		intlist.add(null);
		System.out.println("-" + intlist);
		// array to list
		String[] array = { "Java", "Python", "PHP", "C++" };
		System.out.println(Arrays.toString(array));

		List<String> wordList = Arrays.asList(array);

		List<String> al = new ArrayList<String>();

		wordList.add("Geeks");
		al.add("for");
		al.add("Geeks");

		System.out.println(wordList);

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// list.listIterator()
		TreeSet<String> s = new TreeSet<String>();
		ArrayList<String> list2 = new ArrayList<String>(s);

		ArrayList lst = (ArrayList) list.clone();

		System.out.println(lst);

		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			// System.out.println(str);
		}

		list.forEach(a -> { // Here, we are using lambda expression
			// System.out.println(a);
		});

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}

		};
	}

	public static void arrayListInitialisation() {
		ArrayList<String> gfg = new ArrayList<String>(Arrays.asList("Geeks", "for", "Geeks"));

		ArrayList<String> a = new ArrayList<String>(0);

		a.add("add");
		a.add("add");
		System.out.println(a);
	}

	static public void sortArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		String[] s = list.toArray(new String[list.size()]);
		
		System.out.println(list.indexOf("Banana"));
		
	}
	static public void findElementArrayList() {
	ArrayList<Student> list = new ArrayList<Student>();
	
	
	}
static {
	
}
	public static void main(String args[]) throws CloneNotSupportedException {
		String s,s1="s";
		
		boolean b = true;
		if(b)
		{
			s = "";
		}
		else {
			s = "";
		}
		System.out.println(s==s1);
	}
}