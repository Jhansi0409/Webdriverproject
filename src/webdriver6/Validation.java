package webdriver6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validation {
	@Test
	public static void valid() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String expected="http://";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected)) {
			System.out.println("url is secure::"+expected+"   "+actual);
		}
		else {
			System.out.println("url is local::"+expected+"   "+actual);
		}
		driver.quit();
		
	}


}
