package com.tiquetesbaratos.certification.stepsdefinitions;

//Clase que contiene la lista de pasos que realizara el actor para llenar el formulario de buscar vuelo y seleccionarlos


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosHomePage;
import com.tiquetesbaratos.certification.exceptions.NoFlightFounded;
import com.tiquetesbaratos.certification.exceptions.NoFlightSelected;

import static com.tiquetesbaratos.certification.exceptions.NoFlightFounded.getNoFlightFoundedMessage;
import static com.tiquetesbaratos.certification.exceptions.NoFlightSelected.getNoFlightSelectedMessage;

import com.tiquetesbaratos.certification.questions.SearchFlightResult;
import com.tiquetesbaratos.certification.questions.SelectFlightResult;
import com.tiquetesbaratos.certification.tasks.FillSearchFields;
import com.tiquetesbaratos.certification.tasks.OpenTheBrowser;
import com.tiquetesbaratos.certification.tasks.SelectFlight;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class TiquetesBaratosSearchFlightStepsDefinitions {
	
	@Managed(driver = "chrome") //Le indicamos al WebDriver que use el de chrome
	private WebDriver herBrowser; //Declaramos el webdriver
	
	//Declaramos el actor, usando el metodo estatico named en vez de new
	private Actor susan = Actor.named("Susan"); 
	
	//Declaramos objeto de tipo de la clase que contiene la URL que usaremos
	private TiquetesBaratosHomePage tiquetesHomePage;
	
	@Before
	public void setUp() {
		//Le indicamos al actor que puede navegar en la web mediante el webdriver
		susan.can(BrowseTheWeb.with(herBrowser)); 		
	}
	
	@Given("^that susan is in tiquetes baratos home page$")
	public void that_susan_is_in_tiquetes_baratos_home_page() {
		//Se usa el metodo wasAbleTo de Actor para indicarle lo que pudo hacer
		susan.wasAbleTo(OpenTheBrowser.on(tiquetesHomePage));
	}
	

	@When("^she fill all the fields$")
	public void she_fill_all_the_fields() throws InterruptedException {
		//Le indicamos al actor que llene los campos del formulario buscar vuelo
		Thread.sleep(10000);
		susan.attemptsTo(FillSearchFields.fill());
	}

	@Then("^she should see the available flights$")
	public void she_should_see_the_available_flights() {
		//Validamos
		susan.should(seeThat(SearchFlightResult.page()).orComplainWith(NoFlightFounded.class, 
				getNoFlightFoundedMessage()));
	}
	
	@When("^she select a flight$")
	public void she_select_a_flight() throws InterruptedException {
		//Le indicamos al actor que seleccione los vuelos
		Thread.sleep(10000);
		susan.wasAbleTo(SelectFlight.select());
	}

	@Then("^she should see the confirm flight page$")
	public void she_should_see_the_confirm_flight_page() {
		//Validamos
		susan.should(seeThat(SelectFlightResult.page()).orComplainWith(NoFlightSelected.class, 
				getNoFlightSelectedMessage()));
	}

}
