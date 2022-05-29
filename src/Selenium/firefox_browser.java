package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\VISON\\project\\software\\browserDriver\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
              String Title  = driver.getTitle();
        System.out.println("Title of page is"+ Title);
       String URL  =driver.getCurrentUrl();
       System.out.println("url of page is " + URL);
        
	}
	

}
