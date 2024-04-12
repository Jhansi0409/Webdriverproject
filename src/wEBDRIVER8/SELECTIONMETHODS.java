package wEBDRIVER8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SELECTIONMETHODS {
	@Test
	public static void select() throws Throwable {
		// script to selectlist boxes in facebook application
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select daylistbox=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		boolean value =daylistbox.isMultiple();
		System.out.println(value);
		daylistbox.selectByIndex(3);
		Thread.sleep(5000);
		monthlistbox.selectByVisibleText("Sep");
		Thread.sleep(5000);
		yearlistbox.selectByVisibleText("2001");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
