package week4.day1;

public class LoginPage extends BasePage {

	public void performCommonTasks() {
		System.out.println("select the gender from radio button");
	}

	public static void main(String[] args) {

		LoginPage log = new LoginPage();
		log.clickElement();
		log.enterText();
		log.findElement();
		log.performCommonTasks();

	}

}
