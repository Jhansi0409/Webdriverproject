package wEBDRIVER8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FINDELEMENTS {
	@Test

	public static void element() throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+all_links.size());
		Thread.sleep(5000);
		for (WebElement each : all_links) {
			System.out.println(each.getText());
		}
		driver.quit();

		
	}

}
