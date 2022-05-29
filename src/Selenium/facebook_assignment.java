package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	Thread.sleep(2000);
	//X path Practice
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
//	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("12345678");
	//driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	//Thread.sleep(10000);
	//driver.navigate().refresh();
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vaibhav@gmail.com");
	//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("852475");
	
		WebElement createBtn = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		createBtn.click();
	
		
		
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
