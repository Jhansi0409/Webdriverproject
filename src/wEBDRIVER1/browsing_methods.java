package wEBDRIVER1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browsing_methods {
	@Test

	public void browser()throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.quit(  );
		
	}

}
