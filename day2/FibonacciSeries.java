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

		/*int n = 10; // Number of Fibonacci terms to generate

        // Initialize the first two terms
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        // Handle the cases for 0 or 1 terms
        if (n >= 1) {
            System.out.print(firstTerm);
        }
        if (n >= 2) {
            System.out.print(", " + secondTerm);
        }

        // Generate subsequent terms
        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}*/
