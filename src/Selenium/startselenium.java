package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startselenium {
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://sites.google.com/matrixpune.com/campus/MBA-I");
		
	String title = driver.getTitle();
	
	System.out.println(title);
	//	driver.findElement(By.xpath("//*[@class='wFCWne']")).click();
	//	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//*[text()='Study Material']")).click();

		
	}

}
