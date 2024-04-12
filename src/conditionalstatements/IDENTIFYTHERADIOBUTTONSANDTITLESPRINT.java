package conditionalstatements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDENTIFYTHERADIOBUTTONSANDTITLESPRINT {

public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		List<WebElement> allradios=driver.findElements(By.xpath("//li[contains(@class,'font12 blackText')]"));
		System.out.println("no f radios are"+" "+allradios);
		for (WebElement each: allradios) {
			System.out.println(each.getText());
			
		}
		driver.quit();
		

	}

}
