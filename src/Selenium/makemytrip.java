package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal']")).click();
driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
	
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	

	driver.findElement(By.xpath("//div[contains(@aria-label,'Wed Apr 20 2022')]")).click();
	}

}
