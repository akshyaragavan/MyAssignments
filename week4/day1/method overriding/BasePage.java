package week4.day1;

public class BasePage {
	public void findElement() {
		System.out.println("find the element using id");
	}

	public void clickElement() {
		System.out.println("click the selected element");
	}

	public void enterText() {
		System.out.println("hello world");
	}

	public void performCommonTasks() {
		System.out.println("select the message from dropdown");
	}

	public static void main(String[] args) {

		BasePage base = new BasePage();
		base.findElement();
		base.clickElement();
		base.enterText();
		base.performCommonTasks();

	}

}
