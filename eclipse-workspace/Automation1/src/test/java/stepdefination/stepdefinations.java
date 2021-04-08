package stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefinations{

    @Given("^User is on landing Page$")
    public void user_is_on_landing_page() throws Throwable {
        throw new PendingException();
    }

    @When("^Navigate to loginpage, enter username and password$")
    public void navigate_to_loginpage_enter_username_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^HomePage is populated$")
    public void homepage_is_populated() throws Throwable {
        throw new PendingException();
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();
    }

}