package com.addcart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bigbasket.utilities.Basic;

public class MyBasket extends Basic {

	
	@Test(enabled=false)
	public void VerifyBigBasketFunctionality() throws InterruptedException, IOException{
		
		
		ReadpropertyFile();
		
		
		//Single Product
		driver.findElement(By.xpath(properties.getProperty("ShopByCategory"))).click();
		
		//Click on "Beauty & Hygeine"
		driver.findElement(By.xpath(properties.getProperty("Beauty"))).click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
			
		executor.executeScript("window.scrollBy(0,4200)");			
		
		
		
		// add Lakme nail remover 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("AddProduct"))).click();
		
		String actual=driver.findElement(By.xpath(properties.getProperty("Xpath"))).getText();
		
		String expected="1 items";
		Assert.assertEquals(actual, expected);

	}
	
	//Multiple products
	
       @Test		
		public void VerifyMultipleProductFunctionality() throws IOException, InterruptedException {
		
		
   		ReadpropertyFile();

		driver.findElement(By.xpath(properties.getProperty("ShopByCategory"))).click();
		
		//Click on "Fruits & Vegetables"
		driver.findElement(By.xpath(properties.getProperty("Fruits&Vegetables"))).click();
		
		Thread.sleep(3000);
		
		
		WebElement Element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[3]/button[1]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
        //This will scroll the page till the element is found		
		executor.executeScript("arguments[0].scrollIntoView();", Element);
		
	}

}
