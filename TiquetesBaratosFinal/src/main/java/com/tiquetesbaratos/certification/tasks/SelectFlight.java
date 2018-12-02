package com.tiquetesbaratos.certification.tasks;

//Clase de tipo tarea encargada de seleccionar los vuelos de ida y de regreso de manera aleatoria

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tiquetesbaratos.certification.interactions.SelectAFlight;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosSelectFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class SelectFlight implements Task{

	@Override
	@Step("{0} select a flight")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				//El actor selecciona un vuelo de ida y uno de regreso de manera aleatoria a partir de la busqueda realizada
				Scroll.to(TiquetesBaratosSelectFlightPage.OUTBOUND_FLIGHT),
				SelectAFlight.random(TiquetesBaratosSelectFlightPage.OUTBOUND_FLIGHT),
				Scroll.to(TiquetesBaratosSelectFlightPage.RETURN_FLIGHT),
				SelectAFlight.random(TiquetesBaratosSelectFlightPage.RETURN_FLIGHT),
				Click.on(TiquetesBaratosSelectFlightPage.RESERV_BUTTON));
	}
	
	public static SelectFlight select() {
		return instrumented(SelectFlight.class); //Equivalente a decir new SelectFlight
	}

}
