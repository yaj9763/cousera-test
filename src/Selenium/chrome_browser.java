package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome_browser {
	public static void main(String[] args) throws InterruptedException {
		 
	System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 WebElement username = driver.findElement(By.name("username"));// by id or name
		username.sendKeys("superadmin@example.com"); 
		WebElement password=	driver.findElement(By.id("password"));
		password.sendKeys("sentrifugo");
		WebElement loginbutton=	driver.findElement(By.id("loginsubmit"));
		loginbutton.click();


		
		
	
	
	
	
	}}
			