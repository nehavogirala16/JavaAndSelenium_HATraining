package com.ha.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate onto https://open source-demo.orangehrmlive.com/ 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Enter Username as Admin 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Enter Password as admin123
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Click on Login 
		driver.findElement(By.id("btnLogin")).click();
		
	
		//Print the url
		//driver.findElement
		
		//Click on Welcome  
		driver.findElement(By.id("welcome")).click();
		

        //Click on Logout  
		driver.findElement(By.linkText("Logout")).click(); 
	}

}




 



 


