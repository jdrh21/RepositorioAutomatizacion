package com.tiquetesbaratos.certification.questions;

//Clase que retorna un booleano dependiendo si un elemento es visible para el actor
//Confirma que los vuelos se seleccionaron y estan listos para reservar

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SelectFlightResult implements Question<Boolean>{
	
    private static String errorMessage = "Vuelos seleccionados no estan disponibles";
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Retorna un true si el elemento BOTON_RESERVAR es visible para el actor
		 return the(TiquetesBaratosReservationPage.RESERV_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}

	//Constructor de la clase	
	public static SelectFlightResult page() {
		return new SelectFlightResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}

}
