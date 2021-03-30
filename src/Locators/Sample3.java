package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/textfield%20and%20ggl%20link.html");
		Thread.sleep(2000);
		driver.findElement(By.className("c2")).sendKeys("sat");
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("weekend");
		Thread.sleep(2000);
		
			

	}

}
