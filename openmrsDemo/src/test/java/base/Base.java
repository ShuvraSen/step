package base;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	protected static WebDriver driver;
	protected static SoftAssertions soft; 
		
	
	
	public static void navigateURL(String url) {
		driver.get(url);
		//get always returns String
	}
	
	public static void sendKeys(By by,String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();;
	}
	
	public static String getText(By by) {
		return driver.findElement(by).getText();
	}
	
	public static boolean isEnable(By by) {
		return driver.findElement(by).isEnabled();
	}

}
