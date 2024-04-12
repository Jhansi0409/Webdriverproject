package javascript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HANDLINGListCheckboxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demo.opencart.com/'");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-firstname\").value=\'slenium\'");
		js.executeScript("document.querySelector('#input-lastname').value='testing'");
		js.executeAsyncScript("document.querySelector('#input-email').value='qedge@gmail.com'");
		js.executeScript("document.querySelector('#input-password').value='test@123'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#input-newsletter-yes').click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('input[value='1'][name='agree']').click()");
		Thread.sleep(5000);
		js.executeScript("document.querySlector('button[type='submit']').click()");
		Thread.sleep(5000);
		driver.quit();
		
		
		
				

	}

}
