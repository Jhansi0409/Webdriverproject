package wEBDRIVER7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigationmethods {
	@Test
	public static void navigate() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		WebElement juser=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		juser.clear();
		juser.sendKeys("Admin");
		String jusernametext=juser.getAttribute("value");
		WebElement jpassword=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		jpassword.clear();
		jpassword.sendKeys("Qedge123!@#");
		String jpasswordtext= jpassword.getAttribute("value");
		System.out.println(jusernametext+"  "+jpasswordtext);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if(Actual.contains(expected)) {
			System.out.println("username and password are valid::"+"  "+expected+Actual);

		}
		else
		{
			//capture error message
			String error_message=driver.findElement(By.xpath("//div[@id='divLoginButton']")).getText();
			System.out.println(error_message+"    "+expected+"  "+Actual);

		}
		Thread.sleep(5000);
		driver.quit();
		




	}

}
