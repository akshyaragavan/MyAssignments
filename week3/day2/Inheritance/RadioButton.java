package week3.day2;

public class RadioButton extends Button {
	
	public void selectRadioButton()
	{
		System.out.println("select the gender");
	}

	public static void main(String[] args) {
		RadioButton Radio = new RadioButton();
		Radio.click();
		Radio.setText("welcome");
		Radio.selectRadioButton();
		Radio.submit();
		
		
		

	}

}
