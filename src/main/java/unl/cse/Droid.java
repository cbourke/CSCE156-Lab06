package unl.cse;

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
		return String.format("%s (%s)", this.designation, this.type);
	}
}
