package functionalJava13;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class FunctionalJava {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Person p = new Person();
		Car c = new Car();
		
		c.buy(p);
		
		//retrieve p by reflection
		Method m = c.getClass().getMethod("buy", Person.class);

		Parameter[] params = m.getParameters();
		
		String str = params[0].getName();
		
		System.out.println("parameter name: " + str);
		
	}

}