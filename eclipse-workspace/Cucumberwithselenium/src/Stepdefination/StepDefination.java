package Stepdefination;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.When;

public class StepDefination {

    @io.cucumber.java.en.Given("^Open the Firefox and launch the application$")
    public void open_the_firefox_and_launch_the_application() throws Throwable {
        throw new io.cucumber.java.PendingException();
    }

    @io.cucumber.java.en.When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enter_the_username_something_and_passwordsomething1(String strArg1, String strArg2) throws Throwable {
        throw new io.cucumber.java.PendingException();
    }

    @io.cucumber.java.en.Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable {
        throw new io.cucumber.java.PendingException();
    }
    @When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enter_the_username_something_and_passwordsomething(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }

}