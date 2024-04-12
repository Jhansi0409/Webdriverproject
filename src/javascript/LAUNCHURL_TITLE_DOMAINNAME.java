package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LAUNCHURL_TITLE_DOMAINNAME {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//create object for interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launching url
		js.executeScript("window.location='https://www.tatacliq.com/'");
		Thread.sleep(5000);
		//get page title and its length
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and its length
		String url=js.executeScript("return document.URL").toString();
		System.out.println(url);
		System.out.println(url.length());
		String domain=js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		driver.quit();
		
	}

}
