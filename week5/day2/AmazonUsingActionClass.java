package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonUsingActionClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Launch the URL https://www.amazon.in/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
	// Get the price of the first product.
		List<WebElement> allproducts = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		WebElement firstProduct = allproducts.get(0);
		
		// Print the number of customer ratings for the first displayed product.
		WebElement ratings = driver.findElement(By.xpath("(//span[text()='6,656'])[1]"));
		System.out.println(ratings.getText());
		
		
		// Click the first text link of the first image.
         
		driver.findElement(By.xpath("//span[text()='OnePlus 10 Pro 5G (Emerald Forest, 8GB RAM, 128GB Storage)']")).click();
		Set<String> childWindow = driver.getWindowHandles();
	    List<String>ListWindow=new ArrayList<String>(childWindow);
	    driver.switchTo().window(ListWindow.get(1));

		
		
		// Take a screenshot of the product displayed.
		WebElement firstproduct = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/618hqM-yxtL._SX679_.jpg']"));
		File screenshotAs = firstproduct.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("/Users/siddhu/Desktop/mobile.pdf"));
		System.out.println("The Screenshot is taken successfully");
		
		
		
		// Click the 'Add to Cart' button.
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		// Get the cart subtotal and verify if it is correct.
		WebElement subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println(subtotal.getText());
		
		
		// Close the browser.
		driver.close();
		
		
		
	}

	
}
