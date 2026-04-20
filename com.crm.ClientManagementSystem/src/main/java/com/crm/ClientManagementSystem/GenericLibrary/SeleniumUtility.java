package com.crm.ClientManagementSystem.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	public void lauchChromeBrowser(WebDriver driver) {
		driver=new ChromeDriver();
	}
public void maximizeBrowser(WebDriver driver) {
	driver.manage().window().maximize();
}
public void implicitlyWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void navToApplication(WebDriver driver,String url) {
	driver.get(url);
}
public void mouseHover(WebDriver driver,WebElement address) {
	Actions a= new Actions(driver);
	a.moveToElement(address).perform();
}
public void closeBrowser(WebDriver driver) {
	driver.quit();
}
public void handledropdownByVisibleText(WebElement address,String text) {
	Select s= new Select(address);
	s.selectByVisibleText(text);

}


}
