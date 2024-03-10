package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String url = "http://www.amazon.com/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		

	}

}
