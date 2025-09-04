package week3.day2;

public class Elements extends Button{
	
	public void Execution()
	{
		System.out.println("execute the elements in the page");
	}

	public static void main(String[] args) {
		
		Elements E= new Elements();
		E.click();
		E.setText("welcome");
		E.submit();
		E.Execution();
		
		

	}

}
