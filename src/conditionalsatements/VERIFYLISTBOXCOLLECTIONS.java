package conditionalsatements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VERIFYLISTBOXCOLLECTIONS {

	public static void main(String[] args) throws Throwable {
		// 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/jhans/Downloads/checkbox_1_lyst2257.html");
		List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("no of checkboxes are"+"  "+allcheckboxes.size());
		
		for (WebElement each: allcheckboxes) {
			
			boolean value=each.isSelected();
			System.out.println(each.getAttribute("value")+"  "+value);
			Thread.sleep(5000);
			each.click(); 
			
		}
		driver.quit();
		

	}

}
