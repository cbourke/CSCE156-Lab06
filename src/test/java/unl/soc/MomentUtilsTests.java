package unl.soc;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

import org.junit.Test;

/**
 * This is a suite of tests for the various {@link #MomentUtils#moment()} 
 * methods.
 * 
 * The compiler errors should be addressed once you've completed the lab.  
 * 
 */
public class MomentUtilsTests {
	
	public static final double TOLERANCE = 0.0001;

	/**
	 * Tests that the 3 input {@link MomentUtils#moment(List, double, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest01() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double alpha = .5;
		int k = 1;
		double expected = 2.5;
		double actual = MomentUtils.moment(input, alpha, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 3 input {@link MomentUtils#moment(List, double, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest02() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double alpha = 0;
		int k = 1;
		double expected = 3.0;
		double actual = MomentUtils.moment(input, alpha, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 3 input {@link MomentUtils#moment(List, double, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest03() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double alpha = 3;
		int k = 2;
		double expected = 2.0;
		double actual = MomentUtils.moment(input, alpha, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 3 input {@link MomentUtils#moment(List, double, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest04() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		double alpha = 2;
		int k = 3;
		double expected = 203294.61576007755;
		double actual = MomentUtils.moment(input, alpha, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 3 input {@link MomentUtils#moment(List, double, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest05() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		double alpha = -1;
		int k = 1;
		double expected = 30.71997489640977;
		double actual = MomentUtils.moment(input, alpha, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, double)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest06() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double alpha = .5;
		double expected = 2.5;
		double actual = MomentUtils.moment(input, alpha);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, double)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest07() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double alpha = 0;
		double expected = 3.0;
		double actual = MomentUtils.moment(input, alpha);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, double)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest08() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double alpha = 3;
		double expected = 0.0;
		double actual = MomentUtils.moment(input, alpha);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, double)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest09() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		double alpha = 2;
		double expected = 27.71997489640977;
		double actual = MomentUtils.moment(input, alpha);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, double)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest10() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		double alpha = -1;
		double expected = 30.71997489640977;
		double actual = MomentUtils.moment(input, alpha);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest11() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		int k = 1;
		double expected = 3.0;
		double actual = MomentUtils.moment(input, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest12() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		int k = 1;
		double expected = 3.0;
		double actual = MomentUtils.moment(input, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest13() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		int k = 2;
		double expected = 11.0;
		double actual = MomentUtils.moment(input, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest14() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		int k = 3;
		double expected = 217202.95701392065;
		double actual = MomentUtils.moment(input, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 2 input {@link MomentUtils#moment(List, int)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest15() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		int k = 1;
		double expected = 29.71997489640977;
		double actual = MomentUtils.moment(input, k);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 1 input {@link MomentUtils#moment(List)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest16() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double expected = 3.0;
		double actual = MomentUtils.moment(input);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 1 input {@link MomentUtils#moment(List)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest17() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double expected = 3.0;
		double actual = MomentUtils.moment(input);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 1 input {@link MomentUtils#moment(List)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest18() {
		List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		double expected = 3.0;
		double actual = MomentUtils.moment(input);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 1 input {@link MomentUtils#moment(List)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest19() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		double expected = 29.71997489640977;
		double actual = MomentUtils.moment(input);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
	
	/**
	 * Tests that the 1 input {@link MomentUtils#moment(List)} method
	 * correctly computes the moment on fixed values.
	 */
	@Test
	public void momentFixedTest20() {
		List<Double> input = Arrays.asList(Math.PI, Math.E, 0.0, 100.32, 42.42);
		double expected = 29.71997489640977;
		double actual = MomentUtils.moment(input);
		Assertions.assertEquals(expected, actual, TOLERANCE);
	}
}
