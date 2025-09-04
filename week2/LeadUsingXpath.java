package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeadUsingXpath {

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
		 
		 //create lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 //Enter the CompanyName Field Using Xpath.
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf Project1");
		 
		//Enter the FirstName Field Using Xpath.
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("akshya");
		 
		 //Enter the LastName Field Using Xpath.
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("raghavan");
		 
		 //Enter the FirstName (Local) Field Using Xpath.
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("aks");
		 
		 //Enter the Department Field Using any Locator of Your Choice.
		 driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("computer science");
		 
		 //Enter the Description Field Using any Locator of your choice.
		 driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("selenium automation tester");
		 
		  
		 //Enter your email in the E-mail address Field using the locator of your choice.
		  driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("akshayragavan96@gmail.com");
	
		 //Select State/Province as NewYork Using Visible Text.
		   WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		   Select select=new Select (state);
		   select.selectByContainsVisibleText("New York");
			
		 //Click on the Create Button.
		driver.findElement(By.className("smallSubmit")).click();
			
		 //Click on the edit button.
		driver.findElement(By.linkText("Edit")).click();
		
		 //Clear the Description Field.
		WebElement description = driver.findElement(By.name("description"));
		description.clear();

        //Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Automation testing");
		
		 //Click on the update button.
		driver.findElement(By.className("smallSubmit")).click();
		
		
		 //Get the Title of the Resulting Page.
		String title = driver.getTitle();
		 System.out.println(title);
		
		 //Close the browser window.
		 driver.close();
		 
		 

	}

}
