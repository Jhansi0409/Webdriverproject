package conditionalstaements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class COLLECTION_OFRADIOS_INFACEBOOK {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();
		Thread.sleep(5000);
		List<WebElement> radios=driver.findElements(By.xpath("//span [contains(@class,'_5k_2')]"));
		System.out.println("no of radios are"+"  "+radios.size());
		for (WebElement each : radios) {
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
