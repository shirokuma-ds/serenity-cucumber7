package com.gdn.qa.module.training.steps;

import com.gdn.qa.module.training.pages.WikipediaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaSteps {

    WikipediaPage wikipediaPage;

    private String keyword;

    @Given("I open Wikipedia")
    public void iOpenWikipedia() {
        wikipediaPage.open();
    }

    @When("I search {string}")
    public void iSearchBanana(String args0) {
        this.keyword = args0;
        wikipediaPage.insertIntoSearchField(args0);
        wikipediaPage.clickSearchBtn();
    }

    @Then("Page search found")
    public void pageSearchFound() {
        Assert.assertEquals(keyword.toLowerCase(), wikipediaPage.getPageTitle().toLowerCase());
    }
}
