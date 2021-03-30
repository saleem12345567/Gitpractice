package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Srccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		 int count = links.size();
		 System.out.println(count);
		 for(WebElement we:links)
		 {
			 String images = we.getAttribute("src");
			 System.out.println(images);
		 }

	}

}
