package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@Given("^This is sample hh$")
	public void this_is_sample_hh() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is Given");
	    
	}

	@When("^This is sample When$")
	public void this_is_sample_When() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is When");
	}

	@Then("^This is sample Then$")
	public void this_is_sample_Then() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is Then");
	}
	
}
