package com.newtours.certificacion.StepsDefinitions;

import com.newtours.certificacion.pages.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewToursStepsDefinitions {
	
	@Steps
	LoginSteps login;
	
	@Given("^The new tours page$")
	public void the_new_tours_page() {
	    login.OpenApplication();
	}

	@When("^I fill the user and password field$")
	public void i_fill_the_user_and_password_field() {
	    login.EscribirDatos();
	}

	@When("^Click the submit button$")
	public void click_the_submit_button() {
	    login.EviarDatos();
	}

	@Then("^I acces to a new page$")
	public void i_acces_to_a_new_page() {
	    System.out.println("Logre loguear");
	}

}
