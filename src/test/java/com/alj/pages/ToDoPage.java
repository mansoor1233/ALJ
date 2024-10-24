package com.alj.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alj.base.TestBase;

public class ToDoPage extends TestBase {

	// Pagefactory - Object Rep

	@FindBy(xpath = "(//div[@class='ContentLayout---content_layout ContentLayout---card_choice_template_stacked_tile'][1])")
	WebElement Capex;

	@FindBy(xpath = "(//div[@class='ContentLayout---content_layout ContentLayout---card_choice_template_stacked_tile'])[1]")
	WebElement Acquisition;

	// Initializing the page object
	public ToDoPage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	// Actions
	public void CapexApp() {
		Capex.click();

	}

	public void AcquisionApp() {
		Acquisition.click();

	}

}
