package week3.day2;

public class TestData {

	public void enterCredentials()
	{
		System.out.println("enter user id");
	}
	
	public void navigateToHomePage()
	{
		System.out.println("return");
	}
	
	public static void main(String[] args) {
		
		
		TestData test=new TestData();
		test.enterCredentials();
		test.navigateToHomePage();
	}
}
