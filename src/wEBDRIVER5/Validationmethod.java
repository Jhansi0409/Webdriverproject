package wEBDRIVER5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validationmethod {
	@Test
	public static void vmethod2() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");

		String gmailtext=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		String url=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(url);
		driver.quit();
	}

}
