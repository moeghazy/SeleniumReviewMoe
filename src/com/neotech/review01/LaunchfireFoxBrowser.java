package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchfireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
	    String url = "http://www.nytimes.com/games/wordle/";	
		driver.get(url);
		Thread.sleep(2000);
		
		String curenyUrl = driver.getCurrentUrl();
		if(url.equals(curenyUrl))
		{
		System.out.println("Url is the same ");	
		}else {
			System.out.println("Url is DIFERENT ");	
		}
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
