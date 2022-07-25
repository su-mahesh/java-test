package test;
class Bike{  
	int r;
	  void run(){System.out.println("running");}  
	}  
	class Splendor extends Bike{
		int r;
		void walk(){System.out.println("walk");}  
	  void run(){System.out.println("running safely with 60km");}  
	 
	}  
public class UpCastingExample {
	public static void main(String args[]){  
	    Bike b = new Splendor();//upcasting
	    b.run(); 
	    
	    Object s = b;
	 
	  } 
}
