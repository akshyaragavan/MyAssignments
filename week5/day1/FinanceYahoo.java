package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://finance.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//mouse hover on more buttn
		
		WebElement mh = driver.findElement(By.xpath("//span[text()='More']"));
		Actions act =  new Actions (driver);
		act.moveToElement(mh).perform();
		
		//freeze the DOM for clicking the crypto
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
		
		//locate the table
		WebElement table = driver.findElement(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody"));
		
		//row count
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr"));
		int size = row.size();
		System.out.println(size);
		
		//column count
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/thead/tr/th"));
		int size1 = column.size();
		System.out.println(size1);
		 //entire data
		List<WebElement> rowsandcolumns = driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr/td"));
		
		//iterating through the rows and columns
		for(int i=1; i<row.size(); i++)
		{
			driver.findElement(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr["+i+"]/td"));
			System.out.println("-----------------");
		for(int j=1 ; j<column.size(); j++)
		{
			WebElement datas = driver.findElement(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(datas.getText());
		}
		}
		
		//print the cryptocurrency names from table
		for(int i=1; i<row.size(); i++)
		{
			 WebElement names = driver.findElement(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr["+i+"]/td[2]"));
			System.out.println(names.getText());
		}
		
		
	}

}
