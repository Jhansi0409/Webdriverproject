package wEBDRIVER11;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWITCHINGTOSPECIFICWINDOW {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		ArrayList<String> brw=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window(brw.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("jhjhdsgdf");
		driver.findElement(By.name("pass")).sendKeys("jhjhdsgdf");
		driver.findElement(By.name("//input[@value='Log in']")).sendKeys("jhjhdsgdf");
		Thread.sleep(5000);
		driver.close();
	}

}
