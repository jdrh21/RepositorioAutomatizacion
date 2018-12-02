package com.tiquetesbaratos.certification.stepsdefinitions;

import static com.tiquetesbaratos.certification.exceptions.NoFlightReserved.getNoFlightReservedMessage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;
import org.openqa.selenium.WebDriver;

import com.tiquetesbaratos.certification.exceptions.NoFlightReserved;
import com.tiquetesbaratos.certification.models.ReservationModel;
import com.tiquetesbaratos.certification.questions.ReservFlightResult;
import com.tiquetesbaratos.certification.tasks.Reservation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

//Clase que contiene la lista de pasos que realizara el actor para confirmar la reserva del vuelo

public class TiquetesBaratosConfirmFlightStepsDefinitions {
	@Managed(driver = "chrome") //Le indicamos al WebDriver que use el de chrome
	private WebDriver herBrowser; //Declaramos el webdriver
	
	//Declaramos el actor, usando el metodo estatico named en vez de new
	private Actor susan = Actor.named("Susan"); 
	
	@Before
	public void setUp() {
		//Le indicamos al actor que puede navegar en la web mediante el webdriver
		susan.can(BrowseTheWeb.with(herBrowser)); 
	}
	
	@Given("^that susan is in tiquetes baratos confirm flight page$")
	public void that_susan_is_in_tiquetes_baratos_confirm_flight_page() {
	}

	@When("^she fill all the form fields$")
	public void she_fill_all_the_form_fields(List<ReservationModel> datos) throws InterruptedException {
		//Le indicamos al actor que realice la reservacion
		Thread.sleep(10000);
		susan.attemptsTo(Reservation.doit(datos.get(0)));
	}

	@Then("^she should see the payment page$")
	public void she_should_see_the_payment_page() {
		//Validamos
		susan.should(seeThat(ReservFlightResult.page()).orComplainWith(NoFlightReserved.class, 
				getNoFlightReservedMessage()));
		
	}

}
