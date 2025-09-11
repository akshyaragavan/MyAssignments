package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {

		/**
		 * Declare an array {1, 2, 3, 4, 10, 6, 8}. 
		 * -Do a comparison check if there is a gap in the sequence of numbers. 
		 * - Print the numbers that are missing.
		 */

		List<Integer> value = new ArrayList<>();
		value.add(1);
		value.add(2);
		value.add(3);
		value.add(4);
		value.add(10);
		value.add(6);
		value.add(8);

		Collections.sort(value);
		System.out.println(value);
		for (int i = 0; i < value.size() - 1; i++) {
			int currentElement = value.get(i);
			int nextElement = value.get(i + 1);
			if (currentElement + 1 != nextElement) {

				System.out.println(currentElement);
			}
		}

	}

}
