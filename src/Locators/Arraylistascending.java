package Locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Arraylistascending {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
	ArrayList<String> l=new ArrayList<String>();
	int count = options.size();
		System.out.println(count);
		
		for(WebElement w:options)
		{
			String text = w.getText();
			l.add(text);
		
		Collections.sort(l,Collections.reverseOrder());
		for(String t1:l)
		{
		System.out.println(t1);	
		}
		
		}
	}
}


