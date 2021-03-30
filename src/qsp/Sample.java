package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
		public static void main(String[] args) throws InterruptedException {
			String key="webdriver.gecko.driver";
			String value="./Softwares/geckodriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/maps/");
			Thread.sleep(15000);
			driver.findElement(By.xpath("//img[@class='searchbox-directions-icon']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Chitradurga");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[@class='searchbox-searchbutton'])[3]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//h1[@id='section-directions-trip-title-0']")).click();
		}

	}

