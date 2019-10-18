package com.flipkart.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties properties;
	public static WebDriverWait wait;
	
	public TestBase() throws IOException{
	
	
		 properties = new Properties();
		FileInputStream FI = new FileInputStream("F:/Framework/Flipkart/src/main/java/com/flipkart/config/Config.properties");
		properties.load(FI);
		}	
	{
	 wait = new WebDriverWait(driver,20);
	}
public static void initialization(){
	
	String browsername = properties.getProperty("browser");
	if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
 	 driver =  new ChromeDriver();
	}else if(browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:/Users/hp/downloads/geckodriver");
	driver = new FirefoxDriver();
	}
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
 
 driver.get(properties.getProperty("URL"));
 String un = properties.getProperty("Username");
 String pwd = properties.getProperty("Password");
	
	
	}
}

