package tables4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GETCOLUMNROWCOLLECTION {
	@Test
	public static void columncol() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		//store table into the webelement
		WebElement table=driver.findElement(By.className("ws-table-all"));
		//to get rows and cells collection
		List<WebElement> rows,cols;
		rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		//iterate rows
		for (WebElement eachrow : rows) {
			//to get collection of cols
			cols=eachrow.findElements(By.tagName("td"));
			//iterate cols
			for (WebElement eachcol : cols) {
				System.out.println(eachcol.getText());
				
			}
			driver.quit();
			
		}

	}

}
