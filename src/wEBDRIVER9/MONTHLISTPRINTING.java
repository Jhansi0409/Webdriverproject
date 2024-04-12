package wEBDRIVER9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MONTHLISTPRINTING {
	@Test
	public static void monthlist() throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(5000);
    Select monthlistbox=new Select(driver.findElement(By.xpath("//select[@id='month']")));
    List<WebElement> all_items=monthlistbox.getOptions();
    System.out.println("no of items"+all_items.size());
    for (WebElement each : all_items) {
    	System.out.println(each.getText());
		
	}
    driver.quit();
	}

}
