package week3.day2;

public class TextField extends WebElement{
	
	public void getText()
	{
		System.out.println("good morning everyone");
	}

	public static void main(String[] args) {
		TextField Text = new TextField();
		Text.click();
		Text.setText("welcome");
		Text.getText();

	}

}
