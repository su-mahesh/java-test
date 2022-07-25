package StringExample;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "mk";
	//	System.out.println(s1.hashCode());
		
		String s2 = "mk";
		String s3 = new String("mk");
		String s4 = new String("mks");
		String s5 = "m";
		s5.concat("k");
		String s6 = "m";
		String s7 = s6.concat("k");
		
		String s8 = "mk";
		System.out.println(s6);
		System.out.println(s7 == s2);
		
		StringBuffer bf = new StringBuffer();
		StringExample StringExample= new StringExample();
		System.out.println(Integer.toHexString(StringExample.hashCode()));
		System.out.println(StringExample);

		String str1 = new String("str");
		String str2 = new String("str");
		
		StringBuffer bf1 = new StringBuffer("str");
		StringBuffer bf2 = new StringBuffer("str");
		
		System.out.println(str1.equals(str2));
		System.out.println(bf1.equals(bf2));
		
		System.out.println(str1.equals(bf1));

	}

}
