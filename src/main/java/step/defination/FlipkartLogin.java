package step.defination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLogin {
	
private WebDriver driver;
	
	public FlipkartLogin()
	{
		driver=Hooks.driver;
	}
	
	@Given("User is on Login page.")
	public void user_is_on_login_page(WebDriver driver) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("User enters valid Mobile number.")
	public void user_enters_valid_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("Click Request OTP button.")
	public void click_request_otp_button() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("Validate the OTP")
	public void validate_the_otp() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("I should be on dashboard page.")
	public void i_should_be_on_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("User enters alreday registered Mobile number.")
	public void user_enters_alreday_registered_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("User should get the validation {string}")
	public void user_should_get_the_validation(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}


}
