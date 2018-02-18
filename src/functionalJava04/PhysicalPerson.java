package functionalJava04;

public class PhysicalPerson implements IPerson {

	private String name;

	public PhysicalPerson(String name) {
		this.name = name;
	}


	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name +" "+getSiret();
	}

}
