package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//load the url
		driver.get(" http://leaftaps.com/opentaps/");
		
		//maximize
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
				

		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		 
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
	
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
	
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		//Capture the lead ID of the first resulting lead.
		String text=driver.findElement(By.xpath("//ul[@class='navHistory']//a [contains(@href,'partyId=11783')]")).getText();
		System.out.println(text);
		
		//Click the first resulting lead.
		driver.findElement(By.xpath("//ul[@class='navHistory']//a [contains(@href,'partyId=11783')]")).click();
		
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		
		//Click "Find leads" again.
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	
		
		//Enter the captured lead ID.
		driver.findElement(By.xpath("/input[@name='id']")).sendKeys(text);
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
		
		//Close the browser.
		driver.close();

	}

}
