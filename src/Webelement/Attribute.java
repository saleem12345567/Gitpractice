package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
				{
					System.out.println("Pass");
				}else{
					System.out.println("Fail");
				}
		WebElement ele = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		String value = ele.getAttribute("title");
		System.out.println(value);
		Point location = ele.getLocation();
		System.out.println(location);
		String font = ele.getCssValue("height");
		System.out.println(font);
		
	}

}

