package seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Selenium.browserutills;

public class method2 extends browserutills {
	public static void main(String[] args) {
		openBrowser("chrome");
		driver.get("https://www.rediff.com/");
	//	driver.findElement(By.xpath("//a[starts-with(@title,'Create Rediffmail Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
        
        
        WebElement fullname = driver.findElement(By.xpath("//*[contains(text(),'Full ')]"));
      // is displayed  
	//	boolean fulllname = fullname.isDisplayed();
		System.out.println(fullname.isDisplayed());
		
	// get text	
//	WebElement text = driver.findElement(By.xpath("//td[contains(text(),'By clicking on')]"));
 //   String text1 = text.getText();
  //  System.out.println(text1);
   
    // is selected
    
   // WebElement malee = driver.findElement(By.xpath("//input[@type='radio' and @value='m']"));
//System.out.println(malee.isSelected());    
//malee.click();

//is enabled
// WebElement checkavilblity = driver.findElement(By.xpath("//input[@type='button' and @value='Check availability']"));
 //  System.out.println(checkavilblity.isEnabled());
//checkavilblity.click();

//driver.findElement(By.xpath("//select[contains(@name,'DOB_M')]")).sendKeys("JUN");


    
    
    
    
    
	
	}
	
	

}
