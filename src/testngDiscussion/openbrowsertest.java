package testngDiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbrowsertest {
		@Test
		void openbrowsertestcase(){
			
			System.setProperty("webdriver.chrome.driver", "E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			
		}

}
