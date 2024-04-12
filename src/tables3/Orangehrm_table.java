package tables3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm_table {

	public static void main(String[] args) throws Throwable {
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
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Thread.sleep(5000);
		//(js.executeScript("document.querySelector('a[id='menu_admin_viewAdminModule'] b').click()");
		//store table into the webelement
		WebElement table=driver.findElement(By.xpath("//table[@class=\"table hover\"]"));
		//to get rows and cells collection
		List<WebElement> rows,cols;
		//to get rows collection
		rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		//iterate each row
		for (WebElement eachrow : rows) {
			//to get cols collection
			cols=eachrow.findElements(By.tagName("td"));
			//iterate each row
			for (WebElement eachcol : cols) {
				Thread.sleep(5000);
				System.out.println(eachcol.getText());
				
			}
			System.out.println("================");
			
			
		}
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
