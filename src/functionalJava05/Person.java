package functionalJava05;

public class Person {
	
	private String name;
	private int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" : "+age;
	}

	public static int compare2(Person p1, Person p2) {
		return p1.age - p2.age;
	}

}
