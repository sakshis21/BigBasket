package com.bigbasket.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Basic {

	protected static  WebDriver driver;
	protected static Properties properties;
	public String baseurl="https://www.bigbasket.com/";
	
	
	@BeforeTest
	public  void LaunchBrowserChrome() throws InterruptedException, IOException {
		  
		System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
	  System.out.println("Selenium started.....");
	  
	  driver=new ChromeDriver();
	  
	  driver.get(baseurl);
	  driver.manage().window().maximize();
	  
	  
	 
	  
	  }
	
 protected void ReadpropertyFile() throws IOException {
		
		FileInputStream fileInputStream=new FileInputStream("/home/autoportal/eclipse-workspace/Baby_Destination/Property/Data.Properties");
		
		properties=new Properties();
		properties.load(fileInputStream);

}
}
