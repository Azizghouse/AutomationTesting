package AutomationTesting.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[@href='../../gift-cards?src=header']")).click();
		driver.findElement(By.xpath("//a[@href='']")).click();
		

	}

}