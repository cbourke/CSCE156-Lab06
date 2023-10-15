package unl.soc.solution;

public abstract class Student {

	private final String nuid;
	private final String lastName;
	private final String firstName;
	
	public Student(String nuid, String lastName, String firstName) {
		super();
		this.nuid = nuid;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String toString() {
		return this.lastName + ", " + this.firstName + " (" + this.nuid + ")";
	}
	
}
