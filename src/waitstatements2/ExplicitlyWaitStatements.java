package waitstatements2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWaitStatements {
	@Test

	public static void explicit() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait delay=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait until the element is clickable
		delay.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		//wait until element is visible
		delay.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("selenimu");
		delay.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		driver.quit();
		

	}

}
