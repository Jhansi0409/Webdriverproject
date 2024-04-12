package webdriver12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISRTCMULTIPLELINKIDS {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		driver.findElement(By.xpath("//li[@id='stayIcon']//a")).click();
		driver.findElement(By.xpath("//label[normalize-space()='RAIL DRISHTI']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlefour']")).click();
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-bus']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.irctctourism.com/tourpacakage_search?searchKey=&tagType=&travelType=&category=']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleight']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlenine']")).click();
		Thread.sleep(5000);
		Set<String> allwins=driver.getWindowHandles();
		System.out.println("no of windows are::"+"  "+allwins.size());
		for (String each : allwins) {
			//System.out.println(each);
			String pagetitle=driver.switchTo().window(each).getTitle();
			//Thread.sleep(5000);
			System.out.println(pagetitle);
			
			
		}
		driver.quit();

	}

}
