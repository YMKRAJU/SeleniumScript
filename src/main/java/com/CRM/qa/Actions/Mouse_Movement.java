package com.CRM.qa.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.CRM.qa.Base.Click_ON;

public class Mouse_Movement {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:\\Selenium3\\Drivers//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("YMKRAJU");
		driver.findElement(By.name("password")).sendKeys("RanaRaghuRaju7");
		Click_ON.clickon(driver, driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")), 20);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("/https://www.freecrm.com/system/index.cfm?action=client"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("https://www.freecrm.com/system/index.cfm?action=client&sub=search"))).click();
	}
}
