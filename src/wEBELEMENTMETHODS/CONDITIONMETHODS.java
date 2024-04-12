package wEBELEMENTMETHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CONDITIONMETHODS {
	@Test
	public static void conditionmethod() throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Create new account']  ")).click();
		Thread.sleep(5000);
		//to check the checkbox
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		boolean value=firstname.isEnabled();
		System.out.println(value);
		//to check the hidden items
		WebElement emailaddress=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean email = emailaddress.isDisplayed();
		System.out.println(email);
		//to check the is isselected or not
		WebElement FEMALE=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		boolean gender=FEMALE.isSelected();
		System.out.println(gender);
		driver.quit();



	}

}
