package com.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.Objects.Basepage;
import com.Objects.ScrollPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollPage {
	Basepage bp;
	ScrollPageObject sp;

	public ScrollPage() {
		bp = new Basepage();
		sp = new ScrollPageObject();
	}

	@Given("^User launch the reactjs application$")
	public void user_launch_the_reactjs_application() throws Throwable {
		bp.launch();
	}

	@When("^user click the tutorial tab$")
	public void user_click_the_tutorial_tab() throws Throwable {
		sp.clickTutorialLink();
	}

	@Then("^user should color of text while scroll the page$")
	public void user_should_color_of_text_while_scroll_the_page() throws Throwable {
		boolean result = sp.verifyColorOfContent();
		assertEquals(result, true);
	}

}
