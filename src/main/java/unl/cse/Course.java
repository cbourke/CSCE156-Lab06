package unl.cse;

import java.util.ArrayList;
import java.util.List;

/**
 * Models an individual course.
 *
 */
public class Course {

	private final String department;
	private final String number;
	private final List courseRoster;

	public Course(String department, String number) {
		this.department = department;
		this.number = number;
		this.courseRoster = new ArrayList();
	}

	public void addSection(Section section) {
		this.courseRoster.add(section);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s %s\n", department, number));
		sb.append("=============================================\n");
		for (Object s : this.courseRoster) {
			sb.append(s);
			sb.append("\n");
		}
		return sb.toString();
	}

}
