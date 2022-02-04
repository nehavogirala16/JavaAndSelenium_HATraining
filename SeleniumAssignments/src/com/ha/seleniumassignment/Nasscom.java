package com.ha.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nasscom {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate onto https://nasscom.in/
		driver.get("https://nasscom.in/");

		// Click on New User
		driver.findElement(By.partialLinkText("New User")).click();

		// Enter First name as admin
		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("admin");

		// Enter Last name as pass
		driver.findElement(By.xpath("//input[@id='edit-field-lname']")).sendKeys("pass");

		// Enter email address as admin@gmail.com
		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com");

		// Enter company name as Google
		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");

		// Select IT Consulting from dropdown //No need to automate CAPTCHA
		Select sel = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		sel.selectByVisibleText("IT Consulting");

		// Click on Register
		driver.findElement(By.name("op")).click();

	}

}


