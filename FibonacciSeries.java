package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
	
		
		int n=8;//number of fibonacci series to generate
		
		int num1=0 , num2=1;//initialize the first two terms
		
		System.out.println("the fibonacci series upto " + n + " terms:");
		
		
		 //handle the next two terms
		 if(n>=1)
		 {
		System.out.println(num1);
         }
		 
		 if(n>=2)
		 {
			 System.out.println( num2);
		 }
		 
		 //generate the subsequent terms
		 for(int i=2;i<n;i++)
		 {
			 int sum=num1+num2;
			 System.out.println( sum);
			 num1=num2;
			 num2=sum;
					 
		 }

}
}
