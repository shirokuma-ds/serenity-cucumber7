package com.gdn.qa.module.training.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(value = "https://en.wikipedia.org/")
public class WikipediaPage extends PageObject {

    @FindBy(id = "searchInput")
    private WebElementFacade searchField;

    @FindBy(id = "searchButton")
    private WebElementFacade searchButton;

    @FindBy(id = "firstHeading")
    private WebElementFacade pageTitle;

    public void insertIntoSearchField(String text) {
        searchField.type(text);
    }

    public void clickSearchBtn() {
        searchButton.click();
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

}
