package StringExample;

public class StringDemo implements Cloneable{
	

	@Override
	public StringDemo clone() throws CloneNotSupportedException
	{
		return (StringDemo)super.clone();
	}
	
	
	
	
	static void comp(String s1, String s2)
	{
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		String s1;
		
		String s2;
		/*
		 * Integer i = null; BigDecimal; new Object(). System.out.println(s1 != null);
		 */
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();

		new Object().equals(b);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.equals(b));
		System.out.println(a.toString().equals(b.toString()));
		System.out.println(a.toString().hashCode());
		System.out.println(b.toString().hashCode());
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}

}
