package FramesDatadriventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genericactitime {
	public WebDriver driver;
	//@BeforeMethod
	public void openApplication()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("");
	}
	
	
	

}
