package week1.day2;

public class Browser {
	
	public void launchBrowser (String browserName)
	{
		System.out.println("Given browser name: " + browserName);
		
	}
	
	
	public void loadUrl() 
	{
		System.out.println("url loaded successfully");

	}

	public static void main(String[] args) 
	{
		
		Browser bro=new Browser();
		bro.launchBrowser("safari");
		bro.loadUrl();

	}

}
