package com.ha.seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce {
	/*Navigate onto https://www.salesforce.com/in/form/signup/freetrial-sales/ 

		Enter first name as “John” 

		Enter last name as “wick” 

		Enter work email as “john@gmail.com” 

		Select Job title as “IT Manager” 

		Select Employees as “101-500 employees” 

		Select country as “United Kingdom” 

		Do not fill the phone number 

		Click on check box  

		Click on start my free trial  

		Get the error message displayed “Enter a valid phone number” */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		//driver.findElement(By.xpath("//input[@id='UserFirstName-XruC']")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select sel= new Select(driver.findElement(By.name("UserTitle")));
		sel.selectByVisibleText("IT Manager");
		
		
		
		Select sel1= new Select(driver.findElement(By.name("CompanyEmployees")));
		sel1.selectByVisibleText("101 - 500 employees");
		
		Select sel2= new Select(driver.findElement(By.name("CompanyCountry")));
		sel2.selectByVisibleText("United Kingdom");
		
	   driver.findElement(By.partialLinkText("data-input-check")).click();
		
		
		

	}

}
