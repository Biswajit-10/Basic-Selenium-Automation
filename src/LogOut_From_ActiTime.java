import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut_From_ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));//element is not visible then also it will work
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
}
}
