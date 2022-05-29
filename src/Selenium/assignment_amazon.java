package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone 11",Keys.ENTER);
		
		 List<WebElement> allele = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal' or @class='a-price-whole']"));		

      
     for(int i=0;i<allele.size();i= i+2)
     {
    	// String price=allele.get(i+1).getText();
			    	 System.out.println(allele.get(i).getText()+" = "+allele.get(i+1).getText());

     }
     
	
	
	
	
	
	
	
	
	
	
	
	}
		 
		
		  }
	
	
	
	
	
	
	
	
	
	