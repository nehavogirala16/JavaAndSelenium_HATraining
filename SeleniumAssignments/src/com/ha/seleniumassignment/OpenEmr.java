package com.ha.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEmr {

	public static void main(String[] args) {
	/*	Navigate onto http://demo.openemr.io/b/openemr/ 

			Update username as admin 

			Update password as pass 

			Select Language as “English (Indian)” 

			Click on the login button 

			Click on Messages 

			Click on Add New 

			Enter text in text area as “hello” 

			Select Type as Pharmacy 

			Select Status as New 

			Select 1st user shown 

			Click on Send message 

			Print the error message - Please choose a patient */
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://demo.openemr.io/b/openemr/");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select sel= new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='tabTitle tabHidden']")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("msg")));
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-add']")).click();
		
		
		driver.findElement(By.id("note")).sendKeys("hello");
		
		
		Select drop = new Select(driver.findElement(By.id("form_note_type")));
		drop.selectByVisibleText("Pharmacy");
		
		Select drop1 = new Select(driver.findElement(By.name("form_message_status")));
		drop1.selectByVisibleText("New");
		
		
		Select drop2 = new Select(driver.findElement(By.id("users")));
		drop2.selectByVisibleText("");
		
		
		driver.findElement(By.id("newnote")).click();
	}

}
