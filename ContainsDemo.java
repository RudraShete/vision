import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DontPeep\\Private Dont Peep\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\Laptop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//Relative Xpath using syntax -- //tagname[contains(@attribute,'attribute-value')]
/*		driver.findElement(By.xpath("//a[contains(@class,'_sv4')]")).click();
		driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]")).isDisplayed();		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("1234");
		WebElement veiw=driver.findElement(By.xpath("//button[contains(@id,'u_0')]"));
		System.out.println(veiw.getText());
		driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
//Relative Xpath using syntax -- //tagname[@attribute,'attribute-value' or/and @attribute1,'attribute-value1')]		
		driver.findElement(By.xpath("//a [contains(@class,'_sv4') or @title='English (UK)']")).click();
		driver.findElement(By.xpath("//input[@name='ada' or @id='email']")).sendKeys("123 456");
		driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("235 4");
		WebElement prnt= driver.findElement(By.xpath("//button[contains(@value,'1') and contains(@type,'submit')]"));
		System.out.println(prnt.getText());
		driver.findElement(By.xpath("//button[@value='1' and @type='submit']")).click();
//Relative Xpath using syntax -- //tagname[starts-with(@attribute,'attribute-value')]
		driver.findElement(By.xpath("//a[starts-with(@title,'Engli')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_e')] ")).sendKeys("123 456");
		driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("235 4");
		WebElement prnt= driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]"));
		System.out.println(prnt.getText());
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]")).click();
*///Relative Xpath using syntax -- //tagname[text()='text of web element']
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_e')] ")).sendKeys("123 456");
		driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("235 4");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
	}

}
