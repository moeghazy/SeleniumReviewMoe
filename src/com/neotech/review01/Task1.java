package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https:www.mlssoccer.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.navigate().to("https:www.google.com/");
		Thread.sleep(1000);

	for	(int i =0 ; i < 10 ;i++) {
		driver.navigate().back();
		Thread.sleep(1000);

	
		driver.navigate().forward();
		Thread.sleep(1000);

	
	}
		
		
		
		driver.quit();
	
	}

}
