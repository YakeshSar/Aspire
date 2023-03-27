package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Google {
	
	@Given("User Launch the application")
	public void user_Launch_the_application() {
	  System.out.println("user navigate to google");
	}

	@Then("User should verify google page")
	public void user_should_verify_google_page() {
	    System.out.println("user verify google page");
	}


}
