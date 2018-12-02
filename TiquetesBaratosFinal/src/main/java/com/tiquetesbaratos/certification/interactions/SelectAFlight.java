package com.tiquetesbaratos.certification.interactions;

/*
   CLASE QUE CONTIENE LA INTERACCION PARA DAR CLICK EN UN VUELO ALEATORIO GENERADO POR EL METODO RANDOM
*/

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SelectAFlight implements Interaction{
	
	//Target que contiene todos los vuelos mediante un identificador general, en este caso name = vuelo
	private Target flights;
	
	//Variable que genera el numero aleatorio
	int flight = Math.toIntExact(Math.round(Math.random()*5)+1);
	
	//Constructor de la clase
	public SelectAFlight(Target flights) {
		this.flights = flights;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		//Indicamos que de los vuelos del target "flights", le de click a uno a partir del numero obtenido por "flight"
		flights.resolveAllFor(actor).get(flight).click();
		
	}
	
	//Metodo que crea una instancia de la clase en tiempo de ejecucion
	public static SelectAFlight random(Target flights) {
		return Tasks.instrumented(SelectAFlight.class, flights);
	}

}
