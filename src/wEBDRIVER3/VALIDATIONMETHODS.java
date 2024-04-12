package wEBDRIVER3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VALIDATIONMETHODS {
	@Test
	public static void validation()throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		Reporter.log(pagetitle,true);
		Reporter.log("page length", pagetitle.length(),true);
		String strurl=driver.getCurrentUrl();
		Reporter.log(strurl,true);
		Reporter.log("strurl length", strurl.length(),true);
		driver.quit();
		
 
	}

}
