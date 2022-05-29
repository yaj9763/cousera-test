package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceeookAcoount {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\VISON\\project\\software\\browserDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//a[@class='_97w5']")).click();
////		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ogesj");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("djss");

//		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("15");
//		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Dec");
		
//		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Dec");
//		driver.findElement(By.xpath("//label[@class='_58mt']")).click();


		// dynamic xpath
		String newAcc = "Create New";

				WebElement createBtn = driver.findElement(By.xpath("//a[contains(text(), '" + newAcc + "')]"));
				createBtn.click();

				Thread.sleep(2000);

				String gender = "Female";

				driver.findElement(By.xpath("//label[contains(text(), '" + gender + "')]")).click();

				// Drop down / list box / select box

				// 1 way
				// sendKeys()

				WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));

				day.sendKeys("23");

				// 2 way
				// select class

				WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

				Select selMonth = new Select(month);

				// to select any option it have 3 methods

				selMonth.selectByIndex(11);
				Thread.sleep(2000);

				selMonth.selectByValue("9");
				Thread.sleep(2000);

				selMonth.selectByVisibleText("May");

				List<WebElement> allOps = selMonth.getOptions();

				for (WebElement ele : allOps) {
					System.out.println(ele.getText());
				}

//				System.out.println(selMonth.isMultiple());

				// 3 rd way

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

			year.click();
				Thread.sleep(1000);

				for (int i = 0; i < 6; i++) {
					year.sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}

			year.sendKeys(Keys.ARROW_UP);
			Thread.sleep(1000);
				year.sendKeys(Keys.ARROW_UP);

				year.sendKeys(Keys.ENTER);
				
		//		driver.quit();
			}
		

	
	

	
	
	
	}

