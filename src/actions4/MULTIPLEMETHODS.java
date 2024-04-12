package actions4;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MULTIPLEMETHODS {
	@Test

	public static void multiple() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//create actions class
		Actions ac=new Actions(driver);
		//moving mouse to gmail
		ac.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']")));
		ac.contextClick().perform();
		Thread.sleep(5000);
		//create robot class
		Robot rb=new Robot();
		//moving arro down two two times
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//click ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//to get collecton of windows
		ArrayList<String> allwins=new ArrayList<String>(driver.getWindowHandles());
		//switching to child window
		try {
		driver.switchTo().window(allwins.get(1));
		Thread.sleep(5000);
		//printing child window title
		ac.moveToElement(driver.findElement(By.xpath("//body"))).click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		}catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		//switch to parent window
		driver.switchTo().window(allwins.get(0));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
	

	}

}
