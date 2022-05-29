package Browser.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseaction extends Browser.browserutills{
	
	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement elctronic = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		//Action interface containing only perform() to do some action
		// for mouse movement 
		
		Actions act=new Actions(driver);
		
		
		//build - is used to combine 1 ore more actions in a single unit
		act.moveToElement(elctronic).build().perform();
		//perform -is used to make the action / give permission to do that action
		
	WebElement camara = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		act.moveToElement(camara).build().perform();
		
		WebElement dslr = driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));
	act.moveToElement(dslr).click().build().perform();
		
		Thread.sleep(2000);
	WebElement cam1 = driver.findElement(By.xpath("//div[text()='Canon EOS 3000D DSLR Camera 1 Camera Body, 18 - 55 mm Lens']"));
		
	Thread.sleep(1000);
		// right click
		
	act.contextClick(cam1).build().perform();
		
		
	}

	}

