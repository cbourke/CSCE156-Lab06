package unl.soc.solution;

/**
 * Models a basic droid (android, robot)
 *
 */
public class Droid {

	private final String designation;
	private final String type;
	
	public Droid(String designation, String type) {
		this.designation = designation;
		this.type = type;
	}
	
	public String toString() {
		return this.designation + " (" + this.type + ")";
	}
}
