package tables2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class COLLECTIONOFROWS_CELLS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://money.rediff.com/mutual-funds'");
		Thread.sleep(5000);
		//storing table into webelement
		WebElement table=driver.findElement(By.className("dataTable"));
		//to get collection of rows and cols
		List<WebElement> row,cols;
		//collection of rows always from the table
		row=table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		Thread.sleep(5000);
		//collection of rows always from the table
		//iterate each rows
		for (WebElement eachrow : row) {
			//get each row cell collection  
			cols=eachrow.findElements(By.tagName("td"));
			
			for (WebElement eachcols : cols) {
				//iterate each cells
				Thread.sleep(5000);
				System.out.println(eachcols.getText());
				
			}
			System.out.println("===========================");
			
			
		}
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
