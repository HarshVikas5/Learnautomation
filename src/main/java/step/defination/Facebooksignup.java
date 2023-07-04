package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Facebooksignup {

@Given("User launch the browser.")
public void user_launch_the_browser() {
    // Write code here that turns the phrase above into concrete actions

}

@Given("Open {string}")
public void open(String string) {
    // Write code here that turns the phrase above into concrete actions

}

@When("User Clicked {string}.")
public void user_clicked(String string) {
    // Write code here that turns the phrase above into concrete actions
}

@When("Enters Firstname <Firstname>,Surname <Surname>,Email <Email>, Re-Enter Email <REmail>,New Password <NPassword>.")
public void enters_firstname_firstname_surname_surname_email_email_re_enter_email_r_email_new_password_n_password(String Fname, String Lname, String Email, String Remail, String Npassword) {
    System.out.println(Fname);
    System.out.println(Lname);
    System.out.println(Email);
    System.out.println(Remail);
    System.out.println(Npassword);


}

@When("User selects Date of Birth {int}-Jul-{int}, Gender Male.")
public void user_selects_date_of_birth_jul_gender_male(Integer int1, Integer int2) {
    // Write code here that turns the phrase above into concrete actions

}

@When("User Clicked on Sign Up button.")
public void user_clicked_on_sign_up_button() {
    // Write code here that turns the phrase above into concrete actions

}

@Then("User should display further onboarding steps.")
public void user_should_display_further_onboarding_steps() {
    // Write code here that turns the phrase above into concrete actions

}

@Then("After onboarding completion, User should get registered on facebook and landed on home page")
public void after_onboarding_completion_user_should_get_registered_on_facebook_and_landed_on_home_page() {
    // Write code here that turns the phrase above into concrete actions

}


}
