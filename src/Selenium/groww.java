package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class groww {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://groww.in/");
	
	driver.findElement(By.xpath("//a[@id='homeBox1']")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("//span[@class='rodal-close']")).click();

}
}
