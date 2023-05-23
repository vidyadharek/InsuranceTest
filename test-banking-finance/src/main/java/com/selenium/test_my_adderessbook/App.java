package com.selenium.test_my_adderessbook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        //load driver or set location of driver
    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	 
    	//object of chrome options
    	ChromeOptions chromeOptions = new ChromeOptions();
    	//pass the varibale to the driver
    	chromeOptions.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	System.out.println("selenium test case started");
    	
    	// open the web browser and enter application url
    	driver.get("http://13.115.251.27:8081/");
    	
    	//wait for page to load
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	
    	WebElement link = driver.findElement(By.cssSelector("a.nav-link[href='contact.html']"));
	    link.click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.id("inputName")).sendKeys("TestUser");
	    
    	Thread.sleep(5000);
	    
    	driver.findElement(By.id("inputNumber")).sendKeys("9876543210");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("inputMail")).sendKeys("sampleid@email.com");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("inputMessage")).sendKeys("Test Message"); 
	    
	    driver.findElement(By.class("submit_btn")).click();
    	Thread.sleep(5000);
    	//quite the driver
    	driver.quit();
    	
    	System.out.println("Test cases executed");
    }
}
