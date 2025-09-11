package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertAndFrameInteractionsWithTextVerification {

	public static void main(String[] args) {

		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		// click on try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// click ok/cancel in the alert
		Alert alert = driver.switchTo().alert();
		//alert.sendKeys("akshya");
		alert.accept();

		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);

	}

}
