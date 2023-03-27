package com.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollPage {
	WebDriver driver;

	@Given("^User launch the reactjs application$")
	public void user_launch_the_reactjs_application() throws Throwable {
		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://react.dev/");
	}

	@When("^user click the tutorial tab$")
	public void user_click_the_tutorial_tab() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Learn']")).click();
	}

	@Then("^user should color of text while scroll the page$")
	public void user_should_color_of_text_while_scroll_the_page() throws Throwable {
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='space-y-2 pb-16']//li//a"));
		int count = 0;
		for (WebElement element : findElements) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			List<WebElement> findElements2 = driver
					.findElements(By.xpath("//ul[@class='space-y-2 pb-16']//li//a//parent::li"));
			for (WebElement element2 : findElements2) {
				String attribute = element2.getAttribute("class");
				if (attribute.contains("dark:bg-highlight-dark")) {
					count++;
				}
			}
		}
		System.out.println(count);
		assertEquals(findElements.size(), count);
	}

}
