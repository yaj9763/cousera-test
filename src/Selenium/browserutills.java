package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserutills {

	public static WebDriver driver = null;

	public static void openBrowser(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if
			(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","E:\\VISON\\project\\software\\browserDriver\\geckodriver.exe");
				
	
		   driver =new FirefoxDriver();}
		
		driver.manage().window().maximize();
	}}


