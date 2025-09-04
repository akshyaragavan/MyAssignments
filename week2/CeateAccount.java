package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CeateAccount {

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
       
		//click on account
		driver.findElement(By.linkText("Accounts")).click();
		
		//click on create account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Testleaf Projects");
		
		//enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//select industry
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select select=new Select (industry);
		 select.selectByIndex(3);
		 
		 //select ownership
		 WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		 Select select1 = new Select(ownership);
		 select1.selectByContainsVisibleText("S-Corporation");
		 
		 //select source
		 WebElement source = driver.findElement(By.id("dataSourceId"));
		 Select select2=new Select(source);
		 select2.selectByValue("LEAD_EMPLOYEE");
		 
		 //select marketing campaign
		 WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		 Select select3=new Select(marketing);
		 select3.selectByIndex(6);
		 
		 //select state
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select select4 = new Select(state);
		select4.selectByValue("TX");
		 
		//click create account
		driver.findElement(By.className("smallSubmit")).click();
			
		//print the title
		String title = driver.getTitle();
		 System.out.println(title);
		 
		 //close the browser
		 driver.close();
		
	}

}
