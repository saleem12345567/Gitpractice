package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hi");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("1234");
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[id=u_0_b]")).click();
Thread.sleep(2000);
	}

}
