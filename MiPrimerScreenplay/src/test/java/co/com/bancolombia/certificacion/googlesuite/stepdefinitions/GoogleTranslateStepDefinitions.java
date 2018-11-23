package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.googlesuite.questions.TheResult;
import co.com.bancolombia.certificacion.googlesuite.tasks.GoTo;
import co.com.bancolombia.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.tasks.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.*;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome") //Le indicamos al WebDriver que use el de chrome
	private WebDriver herBrowser; //Declaramos el webdriver
	
	private Actor susan = Actor.named("Susan"); //Declaramos el actor, usando el metodo estatico named en vez de new
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser)); //Le indicamos al actor que puede navegar en la web mediante el webdriver
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),//Se usa el metodo wasAbleTo de Actor para indicarle lo que pudo hacer
		GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));//Se usa el metodo wasAble para indicar que el actor fue capaz de "ir" a la aplicacion
	}

	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		susan.wasAbleTo(Translate.the());
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen(String expectedWord) throws Exception {
		susan.should(seeThat(TheResult.is(), equalTo(expectedWord)));
	}



}
