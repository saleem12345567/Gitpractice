package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linksimagescount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//img|//a"));
		int count = links.size();
		System.out.println(count);
		
		for(int i=0;i<=count-1;i++)
		{
			WebElement we = links.get(i);
			String text = we.getText();
			System.out.println(text);
		}
for(int i=count-1;i>=0;i--)
{
	WebElement we = links.get(i);
	 String text = we.getText();
	 System.out.println(text);
}
	}

}
