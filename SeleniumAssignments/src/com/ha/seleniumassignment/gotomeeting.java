package com.ha.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gotomeeting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate onto  https://www.goto.com/meeting/ 
		driver.get("https://www.goto.com/meeting/");
		
		//Click on Accept Recommended Settings 
		driver.findElement(By.id("truste-consent-button")).click();

		//Click on Try Free 
		driver.findElement(By.className("go-button go-button--secondary go-button--large")).click();
		
		//Enter first name as “John” 
		driver.findElement(By.id("first-name")).sendKeys("John");
		
		//Enter last name as “wick” 
		driver.findElement(By.id("last-name")).sendKeys("wick");
		
		//Enter work email as “john@gmail.com” 
		driver.findElement(By.className("inputField__label   ")).sendKeys("john@gmail.com");
		
		//Job Title as “Help Desk” 
		// job title field not der so its a password
		
		driver.findElement(By.id("login__password")).sendKeys("Help Desk");
		
		//Company size – 10-99 
		Select dropdown = new Select(driver.findElement(By.id("CompanySize")));
		dropdown.selectByVisibleText("10 - 99");
		
		//Click on signup 
		//we dont have sign up button for application
	}

}
