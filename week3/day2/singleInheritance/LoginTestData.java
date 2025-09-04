package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUserName()
	{
		System.out.println("enter valid username");
		
	}
	
	public void enterPassword()
	{
		System.out.println("enter valid password");
	}

	public static void main(String[] args) {
		
		LoginTestData Data =new LoginTestData();
		Data.enterCredentials();
		Data.navigateToHomePage();
		Data.enterUserName();
		Data.enterPassword();
		
	}

}
