package wEBDRIVER8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NAVIGATIONCOMMANDS {
	@Test
	public static void navigate2() throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		System.out.println("pagetitle[1]"+driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("pagetitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("pagetitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("pagetitle[4]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();	
		

}
}
