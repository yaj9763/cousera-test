package Browser.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browser.browserutills;

public class keyupkeydowm extends browserutills {
	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome");
		
driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");

driver.manage().window().maximize();


WebElement textfield = driver.findElement(By.xpath("//input[@name='firstname']"));

 Actions action = new Actions(driver);
 
 action.sendKeys(textfield, "Yogesh").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
 
 action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
 
 WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
 
 lastname.click();
 
 action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

 
  	
		




}}


