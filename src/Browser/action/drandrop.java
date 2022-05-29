package Browser.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browser.browserutills;


public class drandrop extends browserutills{
	public static void main(String[] args) {
		
		
		openBrowser("Chrome");
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	 	driver.switchTo().frame(frame);

        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        
        Actions actt = new Actions(driver);
        
        actt.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
        
        
        
        
		
	}

}
