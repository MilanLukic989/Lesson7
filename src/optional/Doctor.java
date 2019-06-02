package optional;

public class Doctor {

	private String name;
	private String title;

	public Doctor(String name, String title) {
		this.name = name;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void doMedicine() {
		System.out.println("Curing....");

	}
}
