package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sallu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
        Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
        {
        System.out.println("pass");	
        }
        else
        {
        	System.out.println("fail");
        }

        
        
}
	
}
