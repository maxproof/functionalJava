package functionalJava07;

public class FunctionalJava {

	public static void main(String[] args) {
		
		callExecution(() -> System.out.println("execution"));
		
		MyInterface myFunction = () -> System.out.println("delayed execution");
		myFunction.execute();
		
		MyClass myObject = new MyClass();
		myFunction = myObject::execute;
		
		myFunction.execute();
		
		callExecution(myObject::execute);//address method object
		
	}
	
	public static void callExecution(MyInterface mi) {
		
		mi.execute();
		
	}

}
