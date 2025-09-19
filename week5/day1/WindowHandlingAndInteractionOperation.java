package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAndInteractionOperation {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		options.addArguments("ok");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRM/SFA link.
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Click on Merge Contacts.
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// Click on the widget of the "From Contact".
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();

		Set<String> fromwindow = driver.getWindowHandles();
		// convert the set into list
		List<String> listwindow = new ArrayList<String>(fromwindow);
		// navigate to from window
		driver.switchTo().window(listwindow.get(1));
		String fwindow = driver.getWindowHandle();

		// Click on the first resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// switch backs to parent window
		driver.switchTo().window(parentwindow);

		// Click on the widget of the "To Contact".

		String parentwindow1 = driver.getWindowHandle();
		System.out.println(parentwindow1);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();

		Set<String> towindow = driver.getWindowHandles();
		// convert the set into list
		List<String> listwindow1 = new ArrayList<String>(towindow);
		// navigate to to window
		driver.switchTo().window(listwindow1.get(1));
		String twindow = driver.getWindowHandle();

		// Click on the second resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();

		// switch backs to parent window1
		driver.switchTo().window(parentwindow1);

		// Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Accept the alert.
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Verify the title of the page.
		String title = driver.getTitle();
		
	}
}
