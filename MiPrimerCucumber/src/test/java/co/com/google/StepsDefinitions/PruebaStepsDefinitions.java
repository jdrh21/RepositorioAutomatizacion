package co.com.google.StepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PruebaStepsDefinitions {
	
	@Given("Precondiciones")
	public void precondiciones() {
	    System.out.println("Precondiciones");
	}

	@When("Realizo acciones")
	public void realizo_acciones() {
		System.out.println("Acciones");
	}

	@Then("Valido resultado")
	public void valido_resultado() {
	    System.out.println("Resultado");
	}

	@When("Realizo acciones {int}")
	public void realizo_acciones(Integer int1) {
	    System.out.println(int1);
	}

	@Then("Valido resultado no valido")
	public void valido_resultado_no_valido() {
	    System.out.println("Validamos");
	}

}
