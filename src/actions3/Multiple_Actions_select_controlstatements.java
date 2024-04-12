package actions3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multiple_Actions_select_controlstatements {
	@Test

	public static void select() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//create object for Actions
		Actions ac=new Actions(driver);
		//move pointer to gmail
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
		ac.click().build().perform();
		Thread.sleep(5000);
		//press arrow for three times
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		//click enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("testing");
		driver.findElement(By.name("lastName")).sendKeys("selenium");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		Select listbox=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement>all_items=listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each: all_items) {
			System.out.println(each.getText());
			
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
