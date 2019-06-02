package optional;

public class DoctorRun {

	public static void main(String[] args) {

		GeneralPractitioner mike = new GeneralPractitioner("Mike", "Dr", "Omron Stethoscope");
		Surgeon john = new Surgeon("John", "MD", "scalpel");

		System.out.println("Doctors name is " + mike.getName() + ". " + ("His title is " + mike.getTitle()) +". " + "His job consists of: ");
		
		mike.doMedicine();
		mike.makeHouseCalls();
		
		System.out.println("");
		
		System.out.println("Doctors name is " + john.getName() + ". " + ("His title is " + john.getTitle()) +". " + "His job consists of: ");
		john.doMedicine();
		john.performSurgery();
		
		
	}

}
