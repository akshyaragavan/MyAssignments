package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		/**
		Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		Add the collection to a list
		Iterate the values in the list
		Print the required output as Wipro, HCL, CTS, Aspire Systems
		*/
		
		List<String> values =new ArrayList<String>();
		//add the values
		values.add("wipro");
		values.add("HCL");
		values.add("CTS");
		values.add("Aspire Systems");
		//sort the values in ascending order
		Collections.sort(values);
		System.out.println(values);
		//print the values in reverse order
		Collections.reverse(values);
		System.out.println(values);
		
		
	}

}
