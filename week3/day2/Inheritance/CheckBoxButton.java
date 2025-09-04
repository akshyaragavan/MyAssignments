package week3.day2;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton()
	{
		System.out.println("click the button to login");
	}

	public static void main(String[] args) {
		CheckBoxButton Check = new CheckBoxButton();
		Check.click();
		Check.setText("welcome");
		Check.submit();
		Check.clickCheckButton();
		
		

	}

}
