package com.CRM.qa.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

	public static void main(String[] args) {
		String path = "C:\\Selenium3\\Drivers//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Select sel_date = new Select(driver.findElement(By.id("day")));
		sel_date.selectByIndex(7);
		Select sel_Month = new Select(driver.findElement(By.id("month")));
		sel_Month.selectByVisibleText("Jul");
		Select sel_Year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel_Year.selectByValue("1991");
		

	}

}
