package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DRAGTOPARTICULARELEMENT {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//creating java instance class
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(5000);
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.linkText("Men"));
		//scroll to men and click on it
		js.executeScript("document.scrollInToView", element);
		element.click();
		String pagetitle1=js.executeScript("return document.title").toString();
		System.out.println(pagetitle1);

	}

}
