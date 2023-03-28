package com.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Basepage {

	public static WebDriver driver;

	public Util util = new Util();
	
	public Basepage() {
		System.setProperty("webdriver.edge.driver", util.getDriver());
		driver = new EdgeDriver();
	}

	public void launch() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(util.getUrl());
	}

	public boolean diplayedElement(WebElement element) {
		boolean result = element.isDisplayed();
		return result;
	}

	
}
