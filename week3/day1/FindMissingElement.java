package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int num[]= {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++)
		{
			int n=i+1;
			if(n != num[i] )	{
				System.out.println(n);
				break;
			}			
		
		}
		
	}
	

}

