package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		 driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
Thread.sleep(20000);
		 driver.findElement(By.xpath("//div[contains(text(),'Mumbai')]")).click();

		 driver.findElement(By.xpath("//div[contains(text(),'To')]")).click();
		// Thread.sleep(20000 );
		// driver.findElement(By.xpath("//div[contains(text(),'Pune International Airport')]")).click();	
		driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
	
 // for(int i =1;i<5;i++) {
//	  driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
  }//
	}


