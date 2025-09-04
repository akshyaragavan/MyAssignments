package week3.day2;

public class Button extends WebElement{
	
	public void submit() 
	{
		System.out.println("submit the form");
	}
	
	

	public static void main(String[] args) {
		
		Button B= new Button();
		B.click();
		B.setText("welcome");
		B.submit();
		
		

	}

}
