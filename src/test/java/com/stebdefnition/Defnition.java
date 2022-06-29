package com.stebdefnition;

import com.base.Baseclass;
import com.projectcucumber.Filereadermanager;
import com.projectcucumber.Pageobjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defnition extends Baseclass {
	Pageobjectmanager pom = new Pageobjectmanager(driver);
	
	@Given("user launches the application")
	public void user_launches_the_application() throws InterruptedException {
	   
	//	launchBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");
	implicityWait(20);
	}
	
	@When("user enters the username and usernamefield")
	public void user_enters_the_username_and_usernamefield() {
		sendKeys(pom.getLoginpage().getUsername(),"umarsalman");
	}
	@When("user enters the userpassword and userpasswordfield")
	public void user_enters_the_userpassword_and_userpasswordfield() {
		sendKeys(pom.getLoginpage().getPassword(), "KY0RBV");

	}
	@Then("user clicks the login buttern and navigates to select hotel page")
	public void user_clicks_the_login_buttern_and_navigates_to_select_hotel_page() {
		click(pom.getLoginpage().getLogin());
	}
	@When("user selects the location from drobdown")
	public void user_selects_the_location_from_drobdown() {
		singleDropdown(pom.getsearch_hotel().getLocation(), "value", "Brisbane");
	}
	@When("user selects the hotel from drobdown")
	public void user_selects_the_hotel_from_drobdown() {
		singleDropdown(pom.getsearch_hotel().getHotels(), "value", "Hotel Sunshine");
	}
	@When("user selects the room type from drobdown")
	public void user_selects_the_room_type_from_drobdown() {
	    singleDropdown(pom.getsearch_hotel().getRoomtype(), "value", "Deluxe");

	}
	@When("user enters the check in date")
	public void user_enters_the_check_in_date() {
	    sendKeys(pom.getsearch_hotel().getCheckin(), "10/06/2022");

	}
	@When("user enters the check out date")
	public void user_enters_the_check_out_date() {
	    sendKeys(pom.getsearch_hotel().getCheckout(), "11/06/2022");

	}
	@When("user selects the adults per room from drobdown")
	public void user_selects_the_adults_per_room_from_drobdown() {
	    singleDropdown(pom.getsearch_hotel().getAdult(), "value", "2");

	}
	@When("user selects the children per room froom drobdown")
	public void user_selects_the_children_per_room_froom_drobdown() {
	    singleDropdown(pom.getsearch_hotel().getChild(), "value", "2");
  
	}
	@Then("user clicks the search butten and navigates to select hotel page")
	public void user_clicks_the_search_butten_and_navigates_to_select_hotel_page() {
	    click(pom.getsearch_hotel().getSubmit());

	}
	@When("user clicks the radio butten")
	public void user_clicks_the_radio_butten() {
	    click(pom.getsearch_hotel().getRadio());

	}
	@Then("user clicks the continue butten and navigates to book hotel")
	public void user_clicks_the_continue_butten_and_navigates_to_book_hotel() {
	    click(pom.getsearch_hotel().getPress());
 
	}
	@When("user enters first name")
	public void user_enters_first_name() {
	    sendKeys(pom.getBook_hotels().getFirstname(), "umar");
  
	}
	@When("user enters last name")
	public void user_enters_last_name() {
	    sendKeys(pom.getBook_hotels().getLastname(), "s");

	}
	@When("user enters billing address")
	public void user_enters_billing_address() {
	    sendKeys(pom.getBook_hotels().getAddress(), "chrompet");

	}
	@When("user enters credit card no number")
	public void user_enters_credit_card_no_number() {
	    sendKeys(pom.getBook_hotels().getCardnum(), "7871552079787155");

	}
	@When("user selects credit card type from drobdown")
	public void user_selects_credit_card_type_from_drobdown() {
	    singleDropdown(pom.getBook_hotels().getCardtype(), "value", "MAST");

	}
	@When("user selcets expiry date select month from drobdown")
	public void user_selcets_expiry_date_select_month_from_drobdown() {
	    singleDropdown(pom.getBook_hotels().getExpmonth(), "value", "5");

	}
	@When("user selects expiry date select year from drobdown")
	public void user_selects_expiry_date_select_year_from_drobdown() {
		singleDropdown(pom.getBook_hotels().getExpyear(), "value", "2022");

	}
	@When("user enters cvv number")
	public void user_enters_cvv_number() {
		sendKeys(pom.getBook_hotels().getCvvnum(), "123");

	}
	@Then("user clicks the  book now butten and navigates to booking confirmation")
	public void user_clicks_the_book_now_butten_and_navigates_to_booking_confirmation() {
		click(pom.getBook_hotels().getBook());

	}
	@Then("user clicks the myitinernary and navigates to booked itinernary")
	public void user_clicks_the_myitinernary_and_navigates_to_booked_itinernary() {
	    click(pom.getBook_hotels().getMyitinerary());
	}
	@Then("user clikcks the logout butten")
	public void user_clikcks_the_logout_butten() {
		click(pom.getBook_hotels().getLogout());
	    
	}

	















}
