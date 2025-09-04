package week3.day1;

public class reverseOddWords {

	public static void main(String[] args) {
		String text= "I am a software tester";
		String[] array = text.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			
			int n=i+2;
			if(n%2==0)
			{
				
			}else {
				char[] charArray=array[i].toCharArray();
				//char[] newChar = new char[charArray.length];
				for (int j =charArray.length -1; j>=0 ;j--) 
				{
					System.out.println(charArray[i]);
					
				}
				
			}
		}

	}

}
