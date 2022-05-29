package seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Selenium.browserutills;

public class methods extends browserutills {
	public static void main(String[] args) throws InterruptedException {
		openBrowser("chrome");
		driver.get("https://en-gb.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		// isDisplayed();
	//	boolean EmailIsDisplay = email.isDisplayed();
	//	System.out.println(EmailIsDisplay);

		//is enabled 
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(loginBtn.isEnabled());
		
		// click()
		//driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		//Thread.sleep(2000);
		
	//		isSelected()
		//	WebElement femaleGen = driver.findElement(By.xpath("//input[@type='radio' and @value=1]"));
		//	System.out.println(femaleGen.isSelected());
		//	femaleGen.click();
		//	System.out.println(femaleGen.isSelected());
		
		// getTagName()
		//WebElement text = driver.findElement(By.xpath("//p[contains(text(), 'By clicking Sign Up')]"));
		//	System.out.println(text.getTagName());
		// getText()
		//System.out.println(text.getText());

		//		WebElement dataPol = driver.findElement(By.xpath("//a[contains(text(), 'Data Policy')]"));

		// getAttribute("attribute name")
		//	System.out.println(dataPol.getAttribute("href"));







		
	}

}
