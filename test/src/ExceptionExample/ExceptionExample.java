package ExceptionExample;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample  {
	static void print() {
		
		
		
		
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("a");
		list.add(1);
		
		Method[] methods = List.class.getMethods();
		for(Method m : methods) {
		    if(m.getName().equals("add")) {
		        m.invoke(list, 1);
		        break;
		    }
		}
		print();
		try {
		//	print();
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
		
	}

}
