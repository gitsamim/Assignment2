package com.assignment.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.assignment.utilities.ReadConfig;

public class BaseClass {

	ReadConfig configFile = new ReadConfig();
	public String baseURL = configFile.getApplicationURL(); 
	public String username = configFile.getUsername();
	public String password = configFile.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{ 
		logger = Logger.getLogger("Assignment");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", configFile.getChromepath());
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL); 
	}
	
/*	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	*/
	public void captureScrenshot(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File terget = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, terget); 
		System.out.println("Screenshot taken successfully... ");
	}
	
	public String randomestring()
	{
		String randomEmail = RandomStringUtils.randomAlphanumeric(8);
		return randomEmail;
	}
	
	public String randomeNum()
	{
		String randomEmail2 = RandomStringUtils.randomNumeric(4);
		return randomEmail2;
	}
}







