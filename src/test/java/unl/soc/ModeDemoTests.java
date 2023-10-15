package unl.soc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;

import org.junit.Test;

/**
 * This is a suite of tests for methods in the {@link #ModeDemo} class.
 * 
 * The compiler errors should be addressed once you've completed the lab.
 * 
 */
public class ModeDemoTests {

	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a fixed
	 * list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest01() {
		List<Integer> input = Arrays.asList(6, 6, 7, 1, 2, 3, 3, 2, 1, 4, 5, 6);
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 2);
		expected.put(2, 2);
		expected.put(3, 2);
		expected.put(4, 1);
		expected.put(5, 1);
		expected.put(6, 3);
		expected.put(7, 1);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a fixed
	 * list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest02() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 1);
		expected.put(2, 1);
		expected.put(3, 1);
		expected.put(4, 1);
		expected.put(5, 1);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a fixed
	 * list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest03() {
		List<Integer> input = Arrays.asList(1, 1, 1, 1, 1);
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 5);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a fixed
	 * list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest04() {
		List<Integer> input = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1, 2);
		expected.put(2, 2);
		expected.put(3, 2);
		expected.put(4, 2);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#computeMultiplicities(List)} method with a fixed
	 * list of integers.
	 */
	@Test
	public void computeMultiplicitiesFixedTest05() {
		List<Integer> input = Arrays.asList(1, 1, 0, 2, 3, 9, 4, 6, 8);
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(0, 1);
		expected.put(1, 2);
		expected.put(2, 1);
		expected.put(3, 1);
		expected.put(4, 1);
		expected.put(6, 1);
		expected.put(8, 1);
		expected.put(9, 1);
		Map<Integer, Integer> actual = ModeDemo.computeMultiplicities(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a fixed list of
	 * integers.
	 */
	@Test
	public void findModesFixedTest01() {
		Map<Integer, Integer> input = new HashMap<>();
		input.put(1, 2);
		input.put(2, 2);
		input.put(3, 2);
		input.put(4, 1);
		input.put(5, 1);
		input.put(6, 3);
		input.put(7, 1);
		Set<Integer> expected = new HashSet<>();
		expected.add(6);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a fixed list of
	 * integers.
	 */
	@Test
	public void findModesFixedTest02() {
		Map<Integer, Integer> input = new HashMap<>();
		input.put(1, 1);
		input.put(2, 1);
		input.put(3, 1);
		input.put(4, 1);
		input.put(5, 1);
		Set<Integer> expected = new HashSet<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a fixed list of
	 * integers.
	 */
	@Test
	public void findModesFixedTest03() {
		Map<Integer, Integer> input = new HashMap<>();
		input.put(1, 5);
		Set<Integer> expected = new HashSet<>();
		expected.add(1);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a fixed list of
	 * integers.
	 */
	@Test
	public void findModesFixedTest04() {
		Map<Integer, Integer> input = new HashMap<>();
		input.put(1, 2);
		input.put(2, 2);
		input.put(3, 2);
		input.put(4, 2);
		Set<Integer> expected = new HashSet<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}

	/**
	 * Tests the {@link ModeDemo#findModes(Map)} method with a fixed list of
	 * integers.
	 */
	@Test
	public void findModesFixedTest05() {
		Map<Integer, Integer> input = new HashMap<>();
		input.put(0, 1);
		input.put(1, 2);
		input.put(2, 1);
		input.put(3, 1);
		input.put(4, 1);
		input.put(6, 1);
		input.put(8, 1);
		Set<Integer> expected = new HashSet<>();
		expected.add(1);
		Set<Integer> actual = ModeDemo.findModes(input);
		Assertions.assertEquals(expected, actual);
	}
}
