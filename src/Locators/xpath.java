package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?elo=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sallu5958@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
