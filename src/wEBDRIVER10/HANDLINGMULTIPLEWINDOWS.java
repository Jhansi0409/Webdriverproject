package wEBDRIVER10;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HANDLINGMULTIPLEWINDOWS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//To get the parent window id
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		//clicking on three links
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		//to get collection of window id's
		Set<String> allwins=driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
			if(!parent.equals(each))
			{
				//switch to each childwindow and get title and close
				String pagetitle=driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
				
			}
			
		}
		//switch to parent
		driver.switchTo().window(parent);
		Select element =new Select(driver.findElement(By.id("year")));
		List<WebElement> all_items=element.getOptions();
		System.out.println("no of items are::"+all_items.size());
		for (WebElement each : all_items) {
			System.out.println(each.getText());
	
			
		}
		driver.quit();
	}

}
