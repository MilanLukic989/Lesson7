package optional;

public class GeneralPractitioner extends Doctor {
	public String stethoscope;
	
	public GeneralPractitioner(String name, String title, String stethoscope) {
		super(name, title);
		this.stethoscope = stethoscope;
	}

	public void makeHouseCalls() {
		System.out.println("Examine patiente with " + stethoscope);
	}
}
