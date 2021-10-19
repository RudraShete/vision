import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DontPeep\\Private Dont Peep\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\Laptop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement acceptalert= driver.findElement(By.xpath("//button[@id='alertButton']"));
		acceptalert.click();
		driver.switchTo().alert().accept();
		WebElement timmeralert= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timmeralert.click();
		WebDriverWait waiting= new WebDriverWait(driver, 10);
		waiting.until(ExpectedConditions.alertIsPresent()).accept();
//		driver.switchTo().alert().accept();
		WebElement confirmbutton=driver.findElement(By.xpath(" //button[@id='confirmButton']"));
		confirmbutton.click();
		String alertmessage= driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("  //a[@id=\"close-fixedban\"]")).click();
		WebElement promptalert=driver.findElement(By.xpath(" //button[@id='promtButton']"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("Master");
		driver.switchTo().alert().accept();
		
		//driver.navigate().to("https://demoqa.com/frames\"");
		driver.get("https://demoqa.com/frames");
		
		WebElement framecall=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(framecall);
//		driver.switchTo().frame("frame1");
//		driver.switchTo().frame(1);
		String frame1= driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
		System.out.println(frame1);
		
		driver.close();
	}

}
