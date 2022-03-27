package qatask;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class StepDefinition {

    DetailsPage DetailsPage = new DetailsPage();

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {

    }

    @Given("^User navigate to Policydetails page$")
    public void userNavigateToPolicydetailsPage() {
        HomePage.homePage();
    }


    @And("^I select the below details as$")
    public void iSelectTheBelowDetailsAs(DataTable dt) throws InterruptedException {
        DetailsPage.Dropdownselection(dt);
    }

    @And("^I enter the values of following fields$")
    public void iEnterTheValuesOfFollowingFields(DataTable dt) throws InterruptedException {
        DetailsPage.Inputvalue(dt);
    }

    @And("^I click the following butons$")
    public void iClickTheFollowingButons(DataTable dt) throws InterruptedException {
        DetailsPage.clickbutton(dt);
        
    }

    @And("^I click on Gotocomparequotes button$")
    public void iClickOnGotocomparequotesButton() {

    }
}
