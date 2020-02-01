package p1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

	public class Flipkart
{

public static void main(String[] args) throws Exception
{
//System.setProperty("webdriver.gecko.driver","d:\\sel_7am\\geckodriver.exe");
 ChromeDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
//Thread.sleep(5000);
driver.get("http://www.flipkart.com");
driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();  //close  login alert

WebElement elec=driver.findElement(By.xpath("//span[text()='Electronics']"));

new Actions(driver).moveToElement(elec).perform();
Thread.sleep(5000);
driver.findElement(By.linkText("Pendrives")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@data-id='ACCD9XW3YU6VYCYS']")).click();
//driver.findElement(By.xpath("//p[starts-with(@title,'Activa 600')]")).click();
Thread.sleep(2000);
ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(lst.get(1));
driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();

Thread.sleep(2000);

WebElement phoneno = driver.findElement(By.xpath("//input[@type='text']"));
phoneno.sendKeys("9847771414");
driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();

}
}
	//*[@id="container"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/a[2]
	//title="Sandisk Cruzer Blade 32 GB"

