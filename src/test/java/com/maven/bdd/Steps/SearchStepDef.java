package com.maven.bdd.Steps;

import com.maven.bdd.page_objects.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SearchStepDef {
    private HomePage homePage = new HomePage();

    @Given("^I am Homepage$")
    public void iAmHomepage() {
        String  actual=homePage.getCurrentUrl();
        assertThat(actual,Matchers.endsWith(".co.uk/") );
    }
    @When("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String product)  {
        homePage.doSearch(product);
    }

    @Then("^I should be able to see respective product$")
    public void i_should_be_able_to_see_respective_product() {
        homePage.getProductHeader();
    }



}
