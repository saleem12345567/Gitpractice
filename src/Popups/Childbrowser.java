package Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println(count);
		for(String wh:allwindows)
		{
			System.out.println(wh);
		}

	}

}
