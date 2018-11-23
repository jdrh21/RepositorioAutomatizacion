package co.com.google.StepsDefinitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import co.com.google.pages.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscarEnGoogleStepsDefinitions {
	BuscarEnGooglePOM Controlador = new BuscarEnGooglePOM();
	@Given("Que puedo abrir el navegador")
	public void que_puedo_abrir_el_navegador() {
		Controlador.OpenBrowser();
	}

	@When("Voy a Google")
	public void voy_a_Google() {
	    Controlador.GoToURL("https://www.google.com/");
	}

	@When("Busco {string} en google")
	public void busco_en_google(String URL) {
		Controlador.GoToURL(URL);
	}

	@Then("Valido que el resultado sea el esperado")
	public void valido_que_el_resultado_sea_el_esperado() {
		assertThat(Controlador.GetElement("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a/h3"), is(equalTo("FANTASMA EN MEDELLÍN COLOMBIA - YouTube")));
	}

}
