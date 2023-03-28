package com.steps;

import java.io.IOException;
import com.Objects.Basepage;
import com.Objects.MainAndAdvancedPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainAndAdvancedGuide {

	Basepage bp;
	MainAndAdvancedPage mp;

	public MainAndAdvancedGuide() {
		bp = new Basepage();
		mp = new MainAndAdvancedPage();
	}

	@Given("User should launch the application")
	public void user_should_launch_the_application() {
		bp.launch();
	}

	@When("User should click on Docs Tab")
	public void user_should_click_on_Docs_Tab() {
		mp.clickDocLink();
	}

	@When("User should click on Main Concept Tab")
	public void user_should_click_on_Main_Concept_Tab() {
		mp.clickMainConceptLink();
	}

	@Then("User should verify the text and save main Concept file")
	public void user_should_verify_the_text_and_save_main_Concept_file() throws IOException {
		mp.verifyTextAndSaveMainConept();
	}

	@When("User should click on Advanced Guide Tab")
	public void user_should_click_on_Advanced_Guide_Tab() {
		mp.clickAdvancedGuideLink();
	}

	@Then("User should verify the text and save advancedguide Concept file")
	public void user_should_verify_the_text_and_save_advancedguide_Concept_file() throws IOException {
		mp.verifyTextAndSaveAdavancedConcept();
	}

}
