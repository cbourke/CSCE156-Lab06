package unl.cse;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student, uniquely identified by their NUID.
 *
 */
public abstract class Student {

	private final String nuid;
	private final String lastName;
	private final String firstName;
	private final List<String> emails;

	public Student(String nuid, String lastName, String firstName) {
		super();
		this.nuid = nuid;
		this.lastName = lastName;
		this.firstName = firstName;
		this.emails = new ArrayList<>();
	}

	public String getNuid() {
		return nuid;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public List<String> getEmails() {
		// return a new, deep copy of the list of emails so as not to expose
		// this class's list
		return new ArrayList<>(this.emails);
	}

	public void addEmail(String email) {
		this.emails.add(email);
	}

	public String toString() {
		return String.format("%s, %s (%s)", this.lastName, this.firstName, this.nuid);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nuid == null) ? 0 : nuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (nuid == null) {
			if (other.nuid != null)
				return false;
		} else if (!nuid.equals(other.nuid))
			return false;
		return true;
	}
	
	

}
