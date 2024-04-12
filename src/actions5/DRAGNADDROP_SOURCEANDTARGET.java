package actions5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DRAGNADDROP_SOURCEANDTARGET {
    @Test
	public static void draganddrop() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		//collection of webpages
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//switching to html page to frames
		driver.switchTo().frame(0);
		//creating istance for the source and target
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		//dragging and dropping
		ac.clickAndHold(source).moveToElement(target).release().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//clicking on button in html page
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Button']"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
