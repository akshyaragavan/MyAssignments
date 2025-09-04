package week3.day1;

public class ChangeOddindexToUppercase {

	public static void main(String[] args) {
		
		String name ="changeme";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
		{
			int n=i+2;
			if(n%2==0)
			{
			} else{
				charArray[i]=Character.toUpperCase(charArray[i]);
				
			}
		}
		//name = new String(charArray);
		name= String.valueOf(charArray);
		System.out.println(name);

	}

}
