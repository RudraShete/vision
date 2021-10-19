import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class cssSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DontPeep\\Private Dont Peep\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\Laptop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.navigate().to("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//	List <WebElement> links = driver.findElements(By.tagName("a"));
	//	System.out.println(links.size());
	//	driver.findElement(By.className("mailicon")).click();
	//	driver.findElement(By.id("login1")).sendKeys("9765137941");
	//	driver.findElement(By.name("passwd")).sendKeys("1234569");
	//	driver.findElement(By.cssSelector("input[type='submit']")).click();
		//Locator using cssselector
		// Locator using cssselector tagname and id using operator (#)
	//	driver.findElement(By.cssSelector("input#email")).sendKeys("9765137941");
	//	driver.findElement(By.cssSelector("#pass")).sendKeys("12345678");
		// Locator using cssselector tagname and class using operator (.)
	//	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("9765137941");
	//	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("123456");
	//	driver.findElement(By.cssSelector("button._42ft._4jy0")).click();
		// Locator using cssselector tagname and other attribute within square bracket[]
	//	driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("9765137941");
	//	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("123456");
	//	driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		// Locator using cssselector tagname. class and other attribute within square bracket[]
	//	driver.findElement(By.cssSelector("input.inputtext._55r1[name='email']")).sendKeys("9765137941");
	//	driver.findElement(By.cssSelector("input.inputtext._55r1[name='pass']")).sendKeys("123456");
	//	driver.findElement(By.cssSelector("button._42ft._4jy0[name='login']")).click();
		// Locator cssselector support transverse from parent tag to child tag using greater(>) symbol and attribute
	//	driver.findElement(By.cssSelector("div>input[name='email']")).sendKeys("9765137941");
	//	driver.findElement(By.cssSelector("div>input[name='pass']")).sendKeys("123456");
	//	driver.findElement(By.cssSelector("div>button[name='login']")).click();
		//Locator cssselector support sub string using sysmbol ^, $ and *
	//	driver.findElement(By.cssSelector("div>input[name^='ema']")).sendKeys("9765137941");
	//	driver.findElement(By.cssSelector("div>input[name$='ss']")).sendKeys("123456");
	//	driver.findElement(By.cssSelector("div>button[name*='gi']")).click();
	}

}
