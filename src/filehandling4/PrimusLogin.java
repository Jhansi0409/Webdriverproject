package filehandling4;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusLogin {

	public static void main(String[] args) throws Throwable {
		FileReader g = new FileReader("D:/primus login.txt");
		BufferedReader bw = new BufferedReader(g);
		String str;
		while((str=bw.readLine())!=null){
			String login[]=str.split(":");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(5000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(5000);
			String expected="dashboard";
			String actual=driver.getCurrentUrl();
			if(actual.contains(expected)) {
				System.out.println("login success");
			}
			else {
				System.out.println("login failure");
			}
			
			
			
		}
		

	}

}
