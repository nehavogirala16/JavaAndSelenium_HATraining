package com.ha.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitassignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate onto https://github.com/ 
		driver.get("https://github.com/");
		
		
		//Click on Sign in 
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline']")).click();;
		
		//Enter Username as Admin 
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		
		//Enter Password as admin123 
		driver.findElement(By.id("password")).sendKeys("admin123");
		
		//Click on Login 
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']")).click();
		
		
	}

}








