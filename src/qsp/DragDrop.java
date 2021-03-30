package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement b1 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement b2 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement b3 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement b4 = driver.findElement(By.xpath("//div[@id='box105']"));
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.dragAndDrop(b1, b2).perform();
		a.dragAndDrop(b3, b4).perform();
		

	}

}
