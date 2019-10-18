package com.flipkart.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.base.TestBase;

public class LoginPage extends TestBase 
{
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	    WebElement username = driver.findElement(By.className("_2zrpKA"));
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement loginbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	
	public String LoginPageTitleTest()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un ,String pwd ) throws IOException{
	      username.sendKeys(un);
	      password.sendKeys(pwd);
	      loginbutton.click();
		return new HomePage();
	}
	}
	

	
	
	

	