import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DontPeep\\Private Dont Peep\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\Laptop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.navigate().to("https://www.google.com");
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'English (UK)')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	WebDriverWait waiting= new WebDriverWait(driver, 5);
	waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@name,'firstname')]"))).sendKeys("Rudra");
//	driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Rudra");
	
	}
	
}
