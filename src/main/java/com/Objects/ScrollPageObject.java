package com.Objects;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ScrollPageObject extends Basepage {

	public ScrollPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Learn']")
	private WebElement learnLink;
	@FindBys(@FindBy(xpath = "//ul[@class='space-y-2 pb-16']//li//a"))
	private List<WebElement> listOfContent;
	@FindBys(@FindBy(xpath = "//ul[@class='space-y-2 pb-16']//li//a//parent::li"))
	private List<WebElement> listContentOfColors;

	public WebElement getLearnLink() {
		return learnLink;
	}

	public List<WebElement> getListOfContent() {
		return listOfContent;
	}

	public List<WebElement> getListContentOfColors() {
		return listContentOfColors;
	}

	public void clickTutorialLink() {
		getLearnLink().click();
	}

	public boolean verifyColorOfContent() {
		boolean result = false;
		List<WebElement> findElements = getListOfContent();
		int count = 0;
		for (WebElement element : findElements) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			List<WebElement> findElements2 = getListContentOfColors();
			for (WebElement element2 : findElements2) {
				String attribute = element2.getAttribute("class");
				if (attribute.contains("dark:bg-highlight-dark")) {
					count++;
				}
			}
		}
		System.out.println(count);
			if(findElements.size() == count)
				return result=true;
		return result;
	}
}
