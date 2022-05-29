package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.noon.com/uae-en/");
	driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("sports shoes for man",Keys.ENTER);
	List<WebElement> ele = driver.findElements(By.xpath("//div[@class='sc-e3js0d-10 fyFmgb']"));
		
            ele.size();
           
System.out.println(ele.size());
	
	
	//sports shoes for man

	
	
	
	
	

	}}
