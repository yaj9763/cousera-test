package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://piexamresult.unipune.ac.in/");	
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	Alert alt = driver.switchTo().alert();
	alt.accept();
		
            
		

	}

}
