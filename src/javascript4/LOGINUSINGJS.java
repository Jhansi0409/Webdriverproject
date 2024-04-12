package javascript4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGINUSINGJS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#txtUsername').value='Admin'");
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		String Expected="dashboard";
		String Actual=js.executeScript("return document.URL").toString();
		if (Actual.contains(Expected)) {
			System.out.println("login successful"+"  "+Expected+Actual);
			
		}
		else {
			String error=js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(error+""+Expected+"  "+Actual);
		}
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
