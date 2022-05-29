package utill;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import Selenium.browserutills;

public class screenshot extends browserutills {
	public static void main(String[] args) throws IOException {
		
		openBrowser("chrome");
		driver.get("https://www.amazon.in/");
		
	WebElement section = driver.findElement(By.xpath("//div[@id='TFCD9Oj9As74rY9OxWjkEw']"));


File source =section.getScreenshotAs(OutputType.FILE);

File dest = new File("C:\\Users\\HP\\Pictures\\Selenium\\"+"zee5"+".jpeg");
FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		//File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	
	//File  to=new File("E:\\VISON\\pic\\"+"zee5"+".jpeg");  
  // FileHandler.copy(source, to);
   
        		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
