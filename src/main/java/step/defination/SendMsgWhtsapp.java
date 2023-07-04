package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendMsgWhtsapp {

@Given("User launched the whatsapp application.")
public void user_launched_the_whatsapp_application() {
    // Write code here that turns the phrase above into concrete actions
}
@Given("User have an account on whatsapp with number {string}")
public void User_have_an_account_on_whatsapp_with_number(String mob) {
    // Write code here that turns the phrase above into concrete actions
}

@When("User Select a person from the list name {string}")
public void user_select_a_person_from_the_list_name(String string) {
    // Write code here that turns the phrase above into concrete actions

}

@When("Type msg {string}")
public void type_msg(String string) {
    // Write code here that turns the phrase above into concrete actions

}

@When("Hit the {string} icon")
public void hit_the_icon(String string) {
    // Write code here that turns the phrase above into concrete actions

}

@Then("The msg should sent to the user {string}")
public void the_msg_should_sent_to_the_user(String string) {
    // Write code here that turns the phrase above into concrete actions

}

@Then("Single tick mark should be displayed on the right bottom of the msg sent.")
public void single_tick_mark_should_be_displayed_on_the_right_bottom_of_the_msg_sent() {
    // Write code here that turns the phrase above into concrete actions

}

}
