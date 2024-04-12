package conditinalstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VERIFYCHECKBOX {
    @Test
	public static void checkbox() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		WebElement checkbox=driver.findElement(By.xpath("//input[@name='remember']"));
		boolean is_selected=checkbox.isSelected();
		System.out.println(is_selected);
		if(is_selected) {
			checkbox.click();
		}
		else {
			checkbox.click();
		}
		driver.quit();

	}

}
