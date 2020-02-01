package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javafx.scene.effect.Light.Point;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();
	
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		Thread.sleep(1000);
		//class="_2zrpKA _1dBPDZ"
		//driver.findElement(By.xpath("/input[@class='_2zrpKA _1dBPDZ']")).sendKeys("ravt");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();	
		
		Actions action = new Actions(driver);
		WebElement category = driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.moveToElement(category).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Pendrives")).click();
		Thread.sleep(5000);
		org.openqa.selenium.Point p= driver.findElement(By.xpath("//div[contains(text(),'OPPO F1 Plus')]")).getLocation();
		System.out.println(p.getX()+"   "+p.getY());
		JavascriptExecutor js= driver;
		js.executeScript("window.scrollTo(0,"+p.getY()+")");
		
		
		
		
				
		
	}

}





