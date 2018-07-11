package com.CRM.qa.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CRM.qa.Base.Click_ON;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		String Path = "C:\\Selenium3\\Drivers//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("YMKRAJU");
		driver.findElement(By.name("password")).sendKeys("RanaRaghuRaju7");
		Click_ON.clickon(driver, driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")), 2);
		//driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out icon-2x']']")).click();	

	}

}
