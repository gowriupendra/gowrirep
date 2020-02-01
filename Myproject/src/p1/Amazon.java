package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{
		

		public static void main(String[] args ) throws Exception
		{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("laptops");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		
			
		
		
	}

}
