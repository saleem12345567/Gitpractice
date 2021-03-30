package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGF trailer 2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();

	}

}
