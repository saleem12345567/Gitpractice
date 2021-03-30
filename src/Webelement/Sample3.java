package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/checked.html");
			Thread.sleep(2000);
		WebElement ele=	driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		boolean b=ele.isSelected();
		if(b)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox not selected");
		}
	}

}
