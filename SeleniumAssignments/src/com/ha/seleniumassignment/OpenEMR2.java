package com.ha.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEMR2 {

	public static void main(String[] args) {
	/*	Navigate onto http://demo.openemr.io/b/openemr/ 

			Update username as admin 

			Update password as pass 

			Select language as English (Indian) 

			Click on the login button 

			Click on Patient/Client à Patient 

			Click Add New Patient 

			Add the first name, last name 

			Update DOB as today's date driver.findElement(By.id("form_DOB")).sendKeys("2021-12-06"); 

			Update the gender 

			Click on the create new patient button above the form 

			Click on confirm create new patient button. 

			Print the text from alert box (if any error before handling alert add 5 sec wait) 

			Handle alert 

			Close the Happy Birthday popup 

			Get the added patient name and print in the console.*/
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://demo.openemr.io/b/openemr/");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select sel= new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
