package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class population {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
	WebElement currentpopoulation = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
	
		int i=1;
		for(i=1;i<11;i++)
		{
			System.out.println("Current world population after every "+i+" Sec ="+currentpopoulation.getText());
			Thread.sleep(1000);
			
			
		}	
		driver.quit();
			
	}
}	