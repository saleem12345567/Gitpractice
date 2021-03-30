package FramesDatadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/mainpage.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.id("t2")).sendKeys("hello");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("world");


		
		}
}
	



