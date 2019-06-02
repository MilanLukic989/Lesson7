package optional;

public class Surgeon extends Doctor {
	public String surgeonKnife;
	
	public Surgeon(String name, String title, String surgeonKnife) {
		super(name, title);
		this.surgeonKnife = surgeonKnife;
	}

	public void performSurgery() {
		System.out.println("Cuting with " + surgeonKnife);
	}
}
