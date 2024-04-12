package calenders1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DATEPICKER {
     @Test
	public static void datepicker() throws Throwable {
		String dob="September/4/2001";
		String temp[]=dob.split("/");
		String month=temp[0];
		String date=temp[1];
		String year=temp[2];
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year)) {
			//click previous button
			driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while(!calmonth.equalsIgnoreCase(month)) {
			//click previous button
			driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement table=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows=table.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			System.out.println(rows.size());
			cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) {
					Thread.sleep(5000);
					eachcol.click();
				}
				
			}
			
			
			
		}
		driver.quit();
		
	}

}
