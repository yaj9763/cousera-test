package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone11",Keys.ENTER);
 
        List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='_4rR01T'or class='_30jeq3 _1_WHN1']"));
        
        System.out.print(( allelements));
        	
        
        for(int i=0;i<allelements.size();) 
        {
        	 System.out.println(allelements.get(i).getText());
        	}


	}}



