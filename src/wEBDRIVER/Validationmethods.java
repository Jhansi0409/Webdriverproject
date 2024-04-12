package wEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validationmethods {
	@Test
	public void urllength() throws Throwable {
		//script to print title and url along with its lengths
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://amazon.com");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String strurl=driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.quit();
	}

	}


