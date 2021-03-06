package HomeWork;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate_Option_In_mtr_ListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/Food.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrListBox);
		List<WebElement> allOption = s.getOptions();
		for(int i=0;i<allOption.size();i++) {
				String text=allOption.get(i).getText();
				if(hs.add(text)==false)
					System.out.println(text);
			}
	
		driver.close();
	}
}
