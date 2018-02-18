package functionalJava04;

public interface IPerson {
	
	String getName();
	default String getSiret() { return "no SIRET"; }

}
