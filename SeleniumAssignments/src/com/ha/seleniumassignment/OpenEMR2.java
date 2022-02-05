package com.ha.seleniumassignment;

import java.time.Duration;

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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://demo.openemr.io/b/openemr/");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select sel= new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Patient/Client']")).click();

		driver.findElement(By.xpath("//div[text()='Patients']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='fin']")));



		driver.findElement(By.id("create_patient_btn1")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));

		driver.findElement(By.id("form_fname")).sendKeys("Shane");

		driver.findElement(By.id("form_lname")).sendKeys("Watson");
		driver.findElement(By.id("form_DOB")).sendKeys("2021-02-05");

		Select selectGender = new Select(driver.findElement(By.id("form_sex")));
		selectGender.selectByVisibleText("Male");

		driver.findElement(By.id("create")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='modalframe']")));

		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();

		driver.switchTo().defaultContent();

		//Thread.sleep(5000);

		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//div[@class='closeDlgIframe']")).click();


		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));

		String patientText = driver.findElement(By.id("text_title")).getText();
		System.out.println("------------------------------------");
		System.out.println("PATIENT TEXT IS " + patientText);
		driver.switchTo().defaultContent();

		driver.quit();

	}

}
