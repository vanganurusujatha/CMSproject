package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.File;

import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
public class ListenerImplementation extends Baseclass implements ITestListener {
ExtentReports report;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		report.createTest(name);
			}

	@Override
	public void onTestFailure(ITestResult result) {
		JavaUtility j= new JavaUtility();
		String name = result.getName();
		String dateandtime = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
	
		File dest = new File("./Screenshots/"+name+dateandtime+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {	
	}
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter= new ExtentSparkReporter("./ExtentReports/report.html");
		reporter.config().setDocumentTitle("CMS EXCUTION REPORT");
		reporter.config().setReportName("Execution Details");
		reporter.config().setTheme(Theme.DARK);		
report= new ExtentReports();
report.attachReporter(reporter);
report.setSystemInfo("url", "http://localhost:8888");
report.setSystemInfo("os", "windows");
report.setSystemInfo("browser", "chrome");
report.setSystemInfo("test engineer", "Sujatha");
	}
     @Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	
	

}
