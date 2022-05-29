package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
				
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://www.rediff.com/");
				driver.manage().window().maximize();
				
				
				String newAcc = "Create Account";

				// dynamic xpath
				WebElement createBtn = driver.findElement(By.xpath("//a[contains(text(), '" + newAcc + "')]"));
				createBtn.click();	
				
		//		driver.findElement(By.xpath("//*[contains(@name,'altemai')][1]")).sendKeys("yaj122335@gmail.com");
		//		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("8605453773");

	            driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]")).sendKeys("15");
	          
				
				
				
				
			//	driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yogesh Jadhav",Keys.TAB);
			//	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("yaj98855");
				//driver.findElement(By.xpath("//input[@type='button']")).click();
			//	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("yogesh875245");
			//	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")).sendKeys("15",Keys.TAB);
				


               
				
	
	
	
	
	
	
	
	}

	

}
