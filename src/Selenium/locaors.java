package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaors {
	public static void main(String[] args) throws InterruptedException {
		 
	System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	// to identify the element on web page we need to use locators

	// 1 id  (1)

	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("java@gmail.com");

	// driver.findElement(By.id("pass")).sendKeys("Pass@123");

	// 2 name (4)
	driver.findElement(By.name("pass")).sendKeys("Pass@123");

	// 3 class name (5)
	String str = driver.findElement(By.className("_8eso")).getText();
	System.out.println(str);

	Thread.sleep(2000);
	// 4 linkText (6)
	driver.findElement(By.linkText("Forgotten password?")).click();

	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();

	// 6 tagName (8)

	boolean isLogoDisplaied = driver.findElement(By.tagName("img")).isDisplayed();
	Thread.sleep(2000);
	System.out.println(isLogoDisplaied);

	// 7 ccsSelector (3)
	// class .classValue / <tagname>.classvalue
	// id #idValue / <tagname>#IdValue

	// Attribute <tag name>[attri='value']

	//driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("Selenium@123");
	
	//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("Selenium@123");
	
	//driver.findElement(By.cssSelector("#pass")).sendKeys("Selenium@123");
	
	//driver.findElement(By.cssSelector("input#pass")).sendKeys("Selenium@123");
	
	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("Selenium@123");
	
	
	//xpath  (2)
	
	// 5 partialLinkText (7)
	driver.findElement(By.partialLinkText("Create New")).click();

	Thread.sleep(3000);
	driver.quit();
}

}


