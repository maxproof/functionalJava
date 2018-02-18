package functionalJava04;

public class MoralPerson implements IPerson {

	private String socialName;
	private String SIRET;
	
	public MoralPerson(String socialName, String SIRET) {
		this.socialName = socialName;
		this.SIRET = SIRET;
	}

	@Override
	public String getName() {
		return socialName;
	}

	@Override
	public String getSiret() {
		return SIRET;
	}
	
	@Override
	public String toString() {
		return socialName + SIRET;
	}
	

}
