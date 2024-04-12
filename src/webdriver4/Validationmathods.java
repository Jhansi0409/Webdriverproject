package webdriver4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validationmathods {
	@Test
	public static void vmethods() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.eclipse.org/downloads/");
		Thread.sleep(5000);
		String expected="Eclipse downloads | the Eclipse Foundation";
		String Actual=driver.getTitle();
		if(expected.equalsIgnoreCase(Actual)) {
			System.out.println("Title is matching::"+expected+"   "+Actual);
		
		}
		else {
			System.out.println("title is not matching::"+expected+"  "+Actual);
			
		}
		driver.quit();
			
			
		
		
				
	}

}
