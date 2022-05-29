package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowserdemo {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void launchapp(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
			
			  driver = new ChromeDriver();
			  }
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\VISON\\project\\software\\browserDriver\\geckodriver.exe");
			  driver= new FirefoxDriver();

			
		}
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/");
		driver.close();
	}

}
