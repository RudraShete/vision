import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DontPeep\\Private Dont Peep\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\Laptop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
//		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//Explicit wait usage		
		WebDriverWait waiting = new WebDriverWait(driver, 5);
		Actions act= new Actions(driver);
		WebElement moveto= driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		act.moveToElement(moveto).build().perform();
		
		WebElement appear= driver.findElement(By.xpath("//div[@id='buttonToolTip']"));
		waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='buttonToolTip']")));
		waiting.until(ExpectedConditions.visibilityOf(appear)).isDisplayed();
		System.out.println(appear.getText());
		WebElement move2= driver.findElement(By.xpath("//a[text()='Contrary']"));
		act.moveToElement(move2).build().perform();
		WebElement appear2= driver.findElement(By.xpath("//div[@id='contraryTexToolTip']"));
		System.out.println(appear2.getText());
		driver.findElement(By.xpath("//button[@id='submit']"));
		
		
		driver.navigate().to("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']"));
		driver.findElement(By.xpath("//input[@id='userEmail']"));
		driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		Actions action = new Actions(driver);
		WebElement scroll= driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		action.moveToElement(scroll).build().perform();
		
		
		
	}

}
