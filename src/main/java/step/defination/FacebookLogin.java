package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin {
	@Given("User is on facebook login page.")
	public void user_is_on_facebook_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("User entered <email> as {string}")
	public void user_entered_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("Password <password> as {string}")
	public void password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("User should be able to login into the facebook")
	public void user_should_be_able_to_login_into_the_facebook() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("Redirected on facebook home page.")
	public void redirected_on_facebook_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("Password <password> as {string}.")
	public void password_as1(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("User should not be able to login into the facebook.")
	public void user_should_not_be_able_to_login_into_the_facebook() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("User should get validation message {string} should display")
	public void user_should_get_validation_message_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

}
