package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	String url = "https://www.instagram.com/";
	
	driver.get(url);
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.navigate().to("https:www.mlssoccer.com/");
	Thread.sleep(1000);
	
	driver.navigate().to("https:www.fifa.com/");
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(1000);
	
	
	driver.navigate().back();
	Thread.sleep(1000);
	
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	}

}
