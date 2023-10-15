package unl.soc.solution;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ModeDemo {

	/**
	 * This method should return a map of integers x in the given list mapping to
	 * the multiplicity of x (the number of times x appears in the list).
	 * 
	 * @param list
	 * @return
	 */
	public static Map<Integer, Integer> computeMultiplicities(List<Integer> list) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		// for each integer x in the list...
		for (Integer x : list) {
			// find the count (the number of times we've seen x already) using the map
			Integer count = counts.get(x);
			if (count == null) {
				// if the key x is not stored in the map (.get() returns null), this is the
				// first time we've seen it, so set count to zero...
				count = 0;
			}
			// and increment it by 1...
			count++;
			// and put it back into the map
			counts.put(x, count);
		}
		return counts;
	}

	/**
	 * This method takes a map (assumed to be a list of integers mapping to their
	 * multiplicity) and returns a set of all modes.
	 * 
	 * @param m
	 * @return
	 */
	public static Set<Integer> findModes(Map<Integer, Integer> m) {
		Set<Integer> result = new HashSet<Integer>();
		int maxCount = 0, maxValue;
		for (Integer key : m.keySet()) {
			if (m.get(key) > maxCount) {
				maxCount = m.get(key);
				maxValue = key;
			}
		}
		for (Integer key : m.keySet()) {
			if (m.get(key) == maxCount) {
				result.add(key);
			}
		}
		// TODO: find the mode(s); that is, the (key) element(s) with the
		// largest value, and return it.
		// The mode may not be unique, thus this method should return a set of modes
		return result;
	}

	public static List<Integer> loadFile() {

		List<Integer> numbers = new ArrayList<Integer>();
		try (Scanner s = new Scanner(new File("data/numbers.dat"))) {
			while (s.hasNext()) {
				numbers.add(s.nextInt());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return numbers;
	}

	public static void printMap(Map<Integer, Integer> m) {
		List<Integer> sortedKeys = new ArrayList<Integer>(m.keySet());
		Collections.sort(sortedKeys);
		for (Integer x : sortedKeys) {
			System.out.println(String.format("%4d appears %4d times", x, m.get(x)));
		}
	}

	public static void main(String args[]) {
		Map<Integer, Integer> m = computeMultiplicities(loadFile());
		printMap(m);
		Set<Integer> modes = findModes(m);
		System.out.println("modes: " + modes);
	}
}
