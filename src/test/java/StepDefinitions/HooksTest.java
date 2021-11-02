package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksTest {

	@Before
	public void setup() {
		System.out.println("Launch FF browser");
		System.out.println("Enter the free crm url");
	}

	@After
	public void teardown() {
		System.out.println("close the browser");
	}

	// local--only for first scenario
	@Before("@First")
	public void beforeFirst() {
		System.out.println("Launch FF browser---first");
		System.out.println("Enter the free crm url--first");
	}
	@After("@First")
	public void AfterFirst() {
		System.out.println("close the browser---first");
	}
	@Given("user is on deal page")
	public void user_is_on_deal_page() {
		System.out.println("User is on dela page");
	}

	@After("@First")
	@When("user fills the deal form")
	public void user_fills_the_deal_form() {
		System.out.println("user fills the deal form");
	}

	@Then("deal is created")
	public void deal_is_created() {
		System.out.println("Deal is created");
	}

	@Given("user is on Contact page")
	public void user_is_on_Contact_page() {
		System.out.println(" User is on contact page");
	}

	@When("user fills the contact form")
	public void user_fills_the_contact_form() {
		System.out.println("user fills the contact form");
	}

	@Then("contact is created")
	public void contact_is_created() {
		System.out.println("contact is created");
	}

	@Given("useris on mail page")
	public void useris_on_mail_page() {
		System.out.println("user is on mail page");
	}

	@When("user fills the mail form")
	public void user_fills_the_mail_form() {
		System.out.println("User fills the mail form");
	}

	@Then("mail is created")
	public void mail_is_created() {
		System.out.println("mail is created");
	}

}
