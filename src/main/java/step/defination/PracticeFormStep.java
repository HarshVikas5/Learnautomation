package step.defination;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.PracticeFormFun;

public class PracticeFormStep {
    private WebDriver driver;
    
    public PracticeFormStep()
    {
    	driver= Hooks.driver;
    }
	@Given("User is on registration page")
	public void user_is_on_registration_page() throws InterruptedException {
    PracticeFormFun.launchBrowser(driver);
	}
	
	@Given("Enter FirstName as {string}, LastName as {string} and Email as {string}")
	public void enter_and(String fname, String lname, String email) throws InterruptedException {
		PracticeFormFun.enterNameEmail(driver, fname, lname, email);
	   
	}

	@When("User click on gender as {string}")
	public void user_click_on_gender_as(String string) {
	    PracticeFormFun.selectGender(driver);

	}

	@When("Enter Mobile number as {string}")
	public void enter_mobile_number_as(String pnum) throws InterruptedException {
	   PracticeFormFun.phnNumber(driver,pnum);

	}

	@When("User Enters {string}, {string}, Date and {string}")
	public void user_enters_date_and(String sub,String hobbies, String add) throws InterruptedException, AWTException {
		PracticeFormFun.subSelection(driver,sub);
		PracticeFormFun.selectHobbies(driver, hobbies);
		PracticeFormFun.selectDate(driver);
		PracticeFormFun.address(driver,add);
	}

	@When("Upload the picture")
	public void upload_the_picture() throws InterruptedException {
		PracticeFormFun.uploadImage(driver);
	}

	@When("Select state as {string} and city as {string}")
	public void select_state_as_and_city_as(String city, String state) {
		PracticeFormFun.selectState(driver,state);
		PracticeFormFun.selectcity(driver,city);
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() {
	PracticeFormFun.clickSubmit(driver);
	}

	@Then("User should register successfully into the portal")
	public void user_should_register_successfully_into_the_portal() {
		PracticeFormFun.clickSubmit(driver);

	}
}
