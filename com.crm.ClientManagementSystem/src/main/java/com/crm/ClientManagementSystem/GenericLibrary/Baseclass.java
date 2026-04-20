package com.crm.ClientManagementSystem.GenericLibrary;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class Baseclass {
	SeleniumUtility sutils= new SeleniumUtility();
	FileUtilis f= new FileUtilis();
	public static WebDriver driver;
@BeforeSuite
	public void connectingWithDatabase() {
		Reporter.log("Database connected",true);
	}
@BeforeTest
public void launchBrowser() throws IOException {

driver=new ChromeDriver();
	sutils.maximizeBrowser(driver);
	sutils.implicitlyWait(driver);
String URL = f.readDataFromPropertyFile("url");
sutils.navToApplication(driver, URL);
	Reporter.log("browser launched successfully",true);
}
@BeforeMethod
public void loginToCMS() throws IOException {
LoginPage lp= new LoginPage(driver);
String un = f.readDataFromPropertyFile("username");
String pw = f.readDataFromPropertyFile("password");
lp.logintocms(driver, un, pw);
Reporter.log("logged in successfully",true);
}

@AfterMethod
public void logoutFromCMS() {
	HomePage hp=new HomePage(driver);
	WebElement element = hp.getProfile();
	sutils.mouseHover(driver, element);
	hp.getSignoutlink().click();
	Reporter.log("logged out successfully");
	
	
}
@AfterTest
public void closeBrowser() {

	sutils.closeBrowser(driver);
}

@AfterSuite
public void diconnectingWithDatabase() {
	Reporter.log("Database disconnected successfully",true);
}
}
