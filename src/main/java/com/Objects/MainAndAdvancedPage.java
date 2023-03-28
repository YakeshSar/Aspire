package com.Objects;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MainAndAdvancedPage extends Basepage {

	@FindBy(xpath = "//a[text()='Docs']")
	private WebElement docLink;
	@FindBy(xpath = "//div[text()='Main Concepts']")
	private WebElement mainConceptLink;
	@FindBy(xpath = "//div[text()='Advanced Guides']")
	private WebElement advancedGuide;
	@FindBys(@FindBy(xpath = "(//ul[contains(@id,'section_')])[2]//li//a"))
	private List<WebElement> mainConceptCategory;
	@FindBys(@FindBy(xpath = "(//ul[contains(@id,'section_')])[3]//li//a"))
	private List<WebElement> advancedConceptCategory;

	public MainAndAdvancedPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDocLink() {
		return docLink;
	}

	public WebElement getMainConceptLink() {
		return mainConceptLink;
	}

	public WebElement getAdvancedGuide() {
		return advancedGuide;
	}

	public List<WebElement> getMainConceptCategory() {
		return mainConceptCategory;
	}

	public List<WebElement> getAdvancedConceptCategory() {
		return advancedConceptCategory;
	}

	public boolean verifyMainConcept() {
		return getMainConceptLink().isDisplayed();
	}

	public void clickDocLink() {
		getDocLink().click();
	}

	public void clickAdvancedGuideLink() {
		getAdvancedGuide().click();
	}
	
	public void clickMainConceptLink() {
		getMainConceptLink().click();
	}

	public void verifyTextAndSaveMainConept() throws IOException {
		List<WebElement> list = getMainConceptCategory();
		FileWriter fout = new FileWriter("Files\\mainConcept.txt");
		for (WebElement element : list) {
			fout.write(element.getText());
		}
		fout.close();
	}

	public void verifyTextAndSaveAdavancedConcept() throws IOException {
		List<WebElement> list = getAdvancedConceptCategory();
		FileWriter fout = new FileWriter("Files\\advancedGuide.txt");
		for (WebElement element : list) {
			fout.write(element.getText());
		}
		fout.close();
	}
}
