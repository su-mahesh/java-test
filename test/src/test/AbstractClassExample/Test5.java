package test.AbstractClassExample;

interface A{  
	public  final int i = 0;
	public static void m() {
	}
 void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A{  
public void c(){System.out.println("I am c");} 
abstract void m();
}  
  
class M extends B{  
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}
	
	void m() {
		// TODO Auto-generated method stub
		
	}  
}  
  
class Test5{  
public static void main(String args[]){  
A a = new M();  

var c =  a.getClass();

System.out.println(a.getClass());
a.a();  
a.b();  
a.c();  
a.d();  
}
}  
