package wEBDRIVER9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FACEBOOKITEMSCOUNTING {
@Test
	public static void itemscount() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select daylistbox=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		List<WebElement> all_items=daylistbox.getOptions();
		System.out.println("no of items::"+"   "+all_items.size());
		Thread.sleep(5000);
		for (WebElement each : all_items) {
			Thread.sleep(5000);
			System.out.println("items name"+"  "+each.getText());
			
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

}
