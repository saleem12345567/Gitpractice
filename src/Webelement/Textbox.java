package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textbox {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Desktop/disable.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@type='textbox']"));
        Thread.sleep(2000);
        boolean b=ele.isEnabled();
        if(b)
        {
        System.out.println("textbox is enabled");
        }
        else
        {
        	System.out.println("textbox is disabled");
        }
	}
}