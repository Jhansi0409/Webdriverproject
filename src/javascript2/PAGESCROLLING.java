package javascript2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAGESCROLLING {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//creating java instance class
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(5000);
		//scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollToHeight)");
		Thread.sleep(5000);
		//scroll bottom to top vertically
		js.executeScript("window.scrollTo(document.body.scrollToHeight,0)");
		Thread.sleep(5000);
		//scroll to certain pixel
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(5000);
		driver.quit();
	
		

	}

}
