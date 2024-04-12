package tables1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABLES_ROWS_COLUMNS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://money.rediff.com/mutual-funds'");
		Thread.sleep(5000);
		//accessing the specific row cell data
		//taking xpath for the table is firstly inspect the first row & above tat we have the table
		String tabletext1=driver.findElement(By.xpath("//table[@class]/tbody/tr[10]/td[1]")).getText();
		String tabletext2=driver.findElement(By.xpath("//table[@class]/tbody/tr[2]/td[2]")).getText();
		System.out.println(tabletext1);
		System.out.println(tabletext2);
		driver.quit();
				

	}

}
