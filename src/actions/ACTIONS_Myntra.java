package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIONS_Myntra {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		//actions class
		Actions ac=new Actions(driver);
		//moving mouse to kids
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).perform();
		Thread.sleep(5000);
		//selecting soft toys
	    ac.moveToElement(driver.findElement(By.linkText("Sarees")));
	    ac.click().perform();
	    ac.pause(5000);
	    
	    //moving pointer to beauty section
	    ac.moveToElement(driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Beauty']"))).perform();
	    Thread.sleep(5000);
	    //selecting hairoil
	    ac.moveToElement(driver.findElement(By.linkText("Hair Oil")));
	    ac.click().perform();
	    Thread.sleep(5000);
	    driver.close();
	}

}
