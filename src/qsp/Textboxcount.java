package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textboxcount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/Textboxcount.html");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("input"));
		int count = links.size();
		System.out.println(count);
		for(WebElement we:links)
		{
			we.sendKeys("19th Jan");
			Thread.sleep(2000);
		}
		for(int i=count-1;i>=0;i--)
		{
	WebElement we1 = links.get(i);
	we1.clear();
	Thread.sleep(2000);
		}

	}

}
