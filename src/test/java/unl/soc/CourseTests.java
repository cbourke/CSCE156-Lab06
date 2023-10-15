package unl.soc;

import org.junit.Test;

import unl.soc.Course;
import unl.soc.Droid;
import unl.soc.Graduate;
import unl.soc.Section;
import unl.soc.Undergraduate;

public class CourseTests {

	/**
	 * This single test is not really a formal test, but exists simply to
	 * check that your parameterization is (at least half) correct.  If this
	 * file fails to compile, you've missed something.  
	 */
	@Test
	public void courseTests() {
		Undergraduate luke = new Undergraduate("1234", "Skywalker", "Luke");
		Undergraduate wedge = new Undergraduate("5678", "Antilles", "Wedge");
		
		Graduate ben = new Graduate("4411", "Kenobi", "Ben");
		Graduate mace = new Graduate("0021", "Windu", "Mace");
		
		Droid c3po = new Droid("C3PO", "Protocol");
		Droid r2d2 = new Droid("R2D2", "Astromech");
		
		Course c = new Course("CSCE", "156");
		Section<Graduate> grads = new Section<>("100");
		grads.enroll(ben);
		grads.enroll(mace);
		Section<Undergraduate> ugrads = new Section<>("200");
		ugrads.enroll(luke);
		ugrads.enroll(wedge);
		c.addSection(grads);
		c.addSection(ugrads);
		//this should not be possible:
		// Section<Droid> bots = new Section<>("300");

	}
}
