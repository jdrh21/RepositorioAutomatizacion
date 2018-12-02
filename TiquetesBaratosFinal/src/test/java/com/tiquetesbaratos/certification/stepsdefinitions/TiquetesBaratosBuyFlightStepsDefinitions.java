package com.tiquetesbaratos.certification.stepsdefinitions;

//Clase que contiene la lista de pasos que realizara el actor para confirmar la compra del vuelo


import static com.tiquetesbaratos.certification.exceptions.NoFlightBuy.getNoFlightBuyMessage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.tiquetesbaratos.certification.exceptions.NoFlightBuy;
import com.tiquetesbaratos.certification.models.CreditCardModel;
import com.tiquetesbaratos.certification.questions.BuyFlightResults;
import com.tiquetesbaratos.certification.tasks.BuyFlight;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TiquetesBaratosBuyFlightStepsDefinitions {
	@Managed(driver = "chrome") //Le indicamos al WebDriver que use el de chrome
	private WebDriver herBrowser; //Declaramos el webdriver
	
	//Declaramos el actor, usando el metodo estatico named en vez de new
	private Actor susan = Actor.named("Susan"); 
	
	@Before
	public void setUp() {
		//Le indicamos al actor que puede navegar en la web mediante el webdriver
		susan.can(BrowseTheWeb.with(herBrowser)); 
	}
	
	@Given("^that susan select the payment form$")
	public void that_susan_select_the_payment_form() {
	}

	@When("^she fill all the pay form fields$")
	public void she_fill_all_the_pay_form_fields(List<CreditCardModel> datos) throws InterruptedException {
		Thread.sleep(10000);
	    susan.attemptsTo(BuyFlight.doit(datos.get(0)));
	}

	@Then("^she buy the ticket$")
	public void she_buy_the_ticket() throws InterruptedException {
	    Thread.sleep(10000);
	  //Validamos
	  		susan.should(seeThat(BuyFlightResults.page()).orComplainWith(NoFlightBuy.class, 
	  				getNoFlightBuyMessage()));
	}

}
