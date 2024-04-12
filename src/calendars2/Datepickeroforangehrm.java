package calendars2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickeroforangehrm {

	public static void main(String[] args) throws Throwable {
		String dol="2024-May-10";
		String temp[]=dol.split("-");
		String year= temp[0];
		String month= temp[1];
		String date= temp[2];
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#txtUsername').value='Admin'");
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		//selecting year from the calendar listbox
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).selectByVisibleText(year);
		Thread.sleep(5000);
		//selecting month from the calendar
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		Thread.sleep(5000);
		//selecting date from the calendar
		//store table into the webelement
		WebElement Table=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		//to get collection of rows
		rows=Table.findElements(By.tagName("tr"));
		//iterate rows
		for (WebElement eachrow: rows) {
			//to get collection of cols
			cols=eachrow.findElements(By.tagName("td"));
			//iterate cols
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) {
					Thread.sleep(5000);
					eachcol.click();
				}
				
				
			}
			
			
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		

	}

}
