package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ACTIONS_ONgoogle {
	@Test
	public static void google() throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("slenium opening in");
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ENTER).perform();
		driver.quit();
		
		
	}

}
