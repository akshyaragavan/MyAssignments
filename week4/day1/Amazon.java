package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		// Launch the URL https://www.myntra.com/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags", Keys.ENTER);

		// Under "department" click "handbags and wallet"
		driver.findElement(By.xpath("//span[text()=\"Women's Handbags, Purses & Wallets\"]")).click();

		// click totes
		driver.findElement(By.xpath("//span[text()=\"Totes\"]")).click();

		// print the count of items found

		List<WebElement> noofbags = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int count = noofbags.size();
		System.out.println(count);

		// Get the list of brand of the products displayed in the page and print the
		// list.

		List<WebElement> brands = driver.findElements(By.xpath("//div[@id='brandsRefinements']"));
		for (WebElement products : brands) {
			String brandName = products.getText().trim();
			if (!brandName.isEmpty()) {
				System.out.println("the brandnames of all the handbags are:" + brandName);
			}

		}
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();

		// Get the list of names of the bags and print it
		List<WebElement> namesofbags = driver
				.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));
		int count1 = namesofbags.size();
		System.out.println("the number of Michael kors bags is:" + count1);
		for (WebElement printthenames : namesofbags) {
			String bags = printthenames.getText().trim();
			if (!bags.isEmpty()) {
				System.out.println(bags);
			}
		}

	}

}
