package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copypaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Desktop/value.html");
	Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//input[@value='hello']"));
		WebElement ele1=driver.findElement(By.xpath("//input[@value='world']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
        ele1.sendKeys(Keys.CONTROL+"av");
		
	}

}
