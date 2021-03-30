package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/Multiple.html");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.id("Prashanth Hotel"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.deselectAll();
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("its a multi select");
		}
		else
		{
			System.out.println("its a single select");
		}
		
		
		
		
		

	}

}
