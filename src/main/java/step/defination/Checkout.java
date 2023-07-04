package step.defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
	
	
	@Given("The guest user is on cart and following items are added into it.")
	public void the_guest_user_is_on_cart_and_following_items_are_added_into_it(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
	}

	@When("Guest user clicked on {string} got redirected to login\\/signup page.")
	public void guest_user_clicked_on_got_redirected_to_login_signup_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("After successful login, Adding {string},{string} confimation & {string} selection.")
	public void after_successful_login_adding_confimation_selection(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("The order with Item Name <Item Name>, Quanlity <Quantity> should be successfully placed.")
	public void the_order_with_item_name_item_name_quanlity_quantity_should_be_successfully_placed() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("User should be able to see order details under {string}.")
	public void user_should_be_able_to_see_order_details_under(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("User should get order confimation through Email and SMS.")
	public void user_should_get_order_confimation_through_email_and_sms() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("Tracking option on order should get enabled.")
	public void tracking_option_on_order_should_get_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	
	}


}
