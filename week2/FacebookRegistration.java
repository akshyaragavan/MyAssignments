package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//load the url
		driver.get(" https://en-gb.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshya");
		
		//Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raghavan");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("akshyaragavan96@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("Password");
		
		//Handle all three dropdowns in Date of birth
		
		    WebElement dayDropdown = driver.findElement(By.id("day"));
	        WebElement monthDropdown = driver.findElement(By.id("month"));
	        WebElement yearDropdown = driver.findElement(By.id("year"));
		
		
	        // Create Select objects
	        Select selectDay = new Select(dayDropdown);
	        Select selectMonth = new Select(monthDropdown);
	        Select selectYear = new Select(yearDropdown);

	        // Select values
	        selectDay.selectByValue("22");
	        selectMonth.selectByVisibleText("Dec");
	        selectYear.selectByVisibleText("1996");

		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click(); 
		
		//close browser
		driver.close();

	}

}
