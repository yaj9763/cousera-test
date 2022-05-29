package Browser.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
WebElement doubble = driver.findElement(By.xpath("//input[@id='double-click']"));
	
	Actions act= new Actions(driver);
	act.doubleClick(doubble).build().perform();
	
	
}
}
