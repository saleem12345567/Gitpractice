package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
     WebElement  ele= driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
        Thread.sleep(2000);
  String text=ele.getText();
  System.out.println(text);
  
  
        
     
	}

}
