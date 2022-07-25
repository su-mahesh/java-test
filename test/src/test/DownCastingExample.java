package test;
interface InterFace{
	
	public static int inI = 0;
	public  int interfacrInt = 0;
	public void interfaceMethod();
	public default int inmethod() 
	{
		System.out.println("in method");
		return 0;
	}

}
class Parent implements InterFace { 
	int par = 0;
	int parentInt = 0;
	void print() {
		System.out.println("parent int "+parentInt);
	}
	public void interfaceMethod() {
		System.out.println("interfaceMethod");	
	}
	public int inmethod() 
	{
		System.out.println("in method");
		return 10;
	}
}  

class Child extends Parent {  
	int parentInt = 1;
	void print() {
		System.out.println("child int "+parentInt);
	}
  static void method1(Parent a) {  
    if(a instanceof Child){  
    	Child d = (Child)a; //downcasting  
       System.out.println("ok downcasting performed");  
      
    }  
  }  
}

public class DownCastingExample  {
	  public static void main (String [] args) {  
		  Parent a = new Child();  
		  
		  Child ch = (Child) a;// down casting
		  

		  InterFace interfaceObjParent = new Parent();
		  InterFace interfaceObjChild = new Child();
		  
		  Parent parent = (Parent) interfaceObjParent;//down casting
		  Child child = (Child) interfaceObjChild;//down casting
				  
				  
		  interfaceObjParent.interfaceMethod();
		 // interfaceObjParent.inmethod();
		  
	      System.out.println(child.inI);
	   //   child.in
		
		  } 
}