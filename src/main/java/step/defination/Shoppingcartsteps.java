package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shoppingcartsteps {

@When("I am logged in as a customer")
public void i_am_logged_in_as_a_customer() {
    // Write code here that turns the phrase above into concrete actions
}


@Given("I have navigated to the shopping page")
public void i_have_navigated_to_the_shopping_page() {
    // Write code here that turns the phrase above into concrete actions

}

@When("I select the item {string} with price {string}")
public void i_select_the_item_with_price(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions

}

@When("I click the {string} button")
public void i_click_the_button(String string) {
    // Write code here that turns the phrase above into concrete actions

}

@Then("the item should be added to my shopping cart")
public void the_item_should_be_added_to_my_shopping_cart() {
    // Write code here that turns the phrase above into concrete actions

}

@Then("the total price should be {string}")
public void the_total_price_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions

}


}
