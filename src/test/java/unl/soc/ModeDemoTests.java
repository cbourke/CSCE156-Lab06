package unl.soc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;

import unl.soc.ModeDemo;

import org.junit.Test;

/**
 * This is a suite of tests for methods in the {@link #ModeDemo} class.
 * 
 * The compiler errors should be addressed once you've completed the lab.  
 * 
 */
public class ModeDemoTests {

	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest01() {
		List<Integer> input = Arrays.asList(6, 6, 7, 1, 2, 3, 3, 2, 1, 4, 5, 6);
		Map<Integer, Integer> expected = Map.of(
				1, 2, 
				2, 2, 
				3, 2,
				4, 1, 
				5, 1, 
				6, 3,
				7, 1);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest02() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
		Map<Integer, Integer> expected = Map.of(
				1, 1, 
				2, 1, 
				3, 1,
				4, 1, 
				5, 1);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest03() {
		List<Integer> input = Arrays.asList(1, 1, 1, 1, 1);
		Map<Integer, Integer> expected = Map.of(
				1, 5);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest04() {
		List<Integer> input = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
		Map<Integer, Integer> expected = Map.of(
				1, 2,
				2, 2, 
				3, 2,
				4, 2);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest05() {
		List<Integer> input = Arrays.asList(1, 1, 0, 2, 3, 9, 4, 6, 8);
		Map<Integer, Integer> expected = Map.of(
				0, 1,
				1, 2,
				2, 1,
				3, 1,
				4, 1,
				6, 1,
				8, 1,
				9, 1);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}
	

	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void findModesFixedTest01() {
		Map<Integer, Integer> input = Map.of(
				1, 2, 
				2, 2, 
				3, 2,
				4, 1, 
				5, 1, 
				6, 3,
				7, 1);
		Set<Integer> expected = Set.of(6);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void findModesFixedTest02() {
		Map<Integer, Integer> input = Map.of(
				1, 1, 
				2, 1, 
				3, 1,
				4, 1, 
				5, 1);
		Set<Integer> expected = Set.of(1, 2, 3, 4, 5);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void findModesFixedTest03() {
		Map<Integer, Integer> input = Map.of(
				1, 5);
		Set<Integer> expected = Set.of(1);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void findModesFixedTest04() {
		Map<Integer, Integer> input = Map.of(
				1, 2,
				2, 2, 
				3, 2,
				4, 2);
		Set<Integer> expected = Set.of(1, 2, 3, 4);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a 
	 * fixed list of integers.
	 */
	@Test
	public void findModesFixedTest05() {
		Map<Integer, Integer> input = Map.of(
				0, 1,
				1, 2,
				2, 1,
				3, 1,
				4, 1,
				6, 1,
				8, 1);
		Set<Integer> expected = Set.of(1);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}
}
