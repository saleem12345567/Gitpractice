package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value)	;
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		String src=driver.getPageSource();
		System.out.println(src);
		driver.close();

	}

}
