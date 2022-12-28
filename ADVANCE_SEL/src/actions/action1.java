package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class action1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://amazon.com/");
		Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
	}

}
