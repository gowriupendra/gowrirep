package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonshop 
{

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("laptops");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//driver.findElement(By.xpath("//span[@text()='Apple MacBook']")).click();
		//WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
		
			
		

	}

}
