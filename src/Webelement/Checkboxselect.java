package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/checkboxes.html");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("input"));
		int count = links.size();
		System.out.println(count);
		for(int i=0;i<=count;i++)
		{
			WebElement we=links.get(i);
			we.click();
			Thread.sleep(2000);
		}

		for( int i=count-1;i>0;i--)
		{
			WebElement we1 = links.get(i);
			we1.click();
			Thread.sleep(2000);
		}
	}

}
