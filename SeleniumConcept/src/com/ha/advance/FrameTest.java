package com.ha.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Java_Selenium_Workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");
		;
		// driver.findElement(By.id("")).click();
		driver.findElement(By.partialLinkText("CONTIN")).click();
        //driver.findElement(By.linkText("CONTINUE")).click();
		driver.switchTo().defaultContent();
	}

}
