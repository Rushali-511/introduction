package StepDefination;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portallogin;
import resources.base;

public class stepdefinations extends base{


    @Given("^Open chromedriver and intialize driver$")
	public void open_chromedriver_and_intialize_driver() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver =InitializeDriver();
		
	}
	
    @When("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String string) {
		driver.get(string);
	}

    @When("^Land on the landing page and click on login button$")
	public void land_on_the_landing_page_and_click_on_login_button() {
		LandingPage lp=new LandingPage(driver);
		if(lp.popupp().size()>0)
		{
			lp.popupclic().click();
		}
		 lp.Lbutoon();
	}
	

    @And("^Enter (.+) and (.+)$")
    public void enter_and(String username, String password) throws Throwable {
    	LoginPage lo=new LoginPage(driver);
		lo.Eemail().sendKeys(username);
		 lo.pass().sendKeys(password);
		 lo.submit().click();	 
	    
	}
	@Then("^Verify that user is logged in$")
	public void verify_that_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    portallogin p=new portallogin(driver);
	    Assert.assertTrue(p.courses().isDisplayed());
	    
	    
	    		
	}



}
