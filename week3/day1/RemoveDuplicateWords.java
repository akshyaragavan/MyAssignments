package week3.day1;

import java.util.Arrays;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] array = text.split(" ");
		for (int i = 0; i < array.length; i++) 
		{
			int count = 0;			
			for (int j = 0; j < array.length; j++) {
				if(array[i].equalsIgnoreCase(array[j])) {
					count++;
					if(count >1) {
						array[j] = "";
					}
				}
			}
			
		}
		System.out.println(String.join(" ", array));
		

	}

}
