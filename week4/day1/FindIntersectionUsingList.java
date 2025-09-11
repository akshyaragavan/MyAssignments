package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {

		/**
		 * Declare an array for {3, 2, 11, 4, 6, 7} - Declare another array for {1, 2, 8, 4, 9, 7} 
		 * - Compare both the arrays - 
		 * Print the values if they are equal
		 */

		List<Integer> Int = new ArrayList<>();
		Int.add(3);
		Int.add(2);
		Int.add(11);
		Int.add(4);
		Int.add(6);
		Int.add(7);

		List<Integer> Int1 = new ArrayList<>();
		Int1.add(1);
		Int1.add(2);
		Int1.add(8);
		Int1.add(4);
		Int1.add(9);
		Int1.add(7);

		List<Integer> IntersectingList = new ArrayList<>();
		for (Integer value : Int) {
			for (Integer value1 : Int1) {
				if (value.equals(value1)) {
					IntersectingList.add(value);
					System.out.println(value);
				}
			}
		}

	}

}
