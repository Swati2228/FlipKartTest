package com.flipkart.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.flipkart.base.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		super();
		
	}
	WebElement offerzone = driver.findElement(By.xpath("//span[@class='_25Wjx4']"));
	
		public String homepagetitle(){
			return driver.getCurrentUrl();
		}
	
		public offerzonepage clickonofferzonelink(){
			offerzone.click();
			return new offerzonepage();
		}
	}

	
		
	


