package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
	
		//initialize the input variable
		int num=17;
	
		for(int i=2;i<=num;i++)
		{
			//check if the number is divisible. if it is, then its not a prime number ; if not its a prime number
			if(num%i==0) 
			{
				System.out.println("not a prime number");
				break;
			}
			else
			{
				System.out.println(" prime number");
				break;
			}
		}
	
	}
	
}
