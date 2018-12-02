package com.tiquetesbaratos.certification.questions;

//Clase que retorna un booleano dependiendo si un elemento es visible para el actor

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosPayFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReservFlightResult implements Question<Boolean>{
	
    private static String errorMessage = "No se pueden reservar estos vuelos";
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Retorna un true si el elemento VISA es visible para el actor
		 return the(TiquetesBaratosPayFlightPage.NOMBRE).answeredBy(actor).isCurrentlyVisible();
	}

	//Constructor de la clase	
	public static ReservFlightResult page() {
		return new ReservFlightResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}

}
