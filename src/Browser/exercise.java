package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

List<WebElement> checkbxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
System.out.println("number of check boxes present in the page"+ checkbxes.size());



	}

}
