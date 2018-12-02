package com.tiquetesbaratos.certification.questions;

//Clase que retorna un booleano dependiendo si un elemento es visible para el actor
//Confirma que la búsqueda de los vuelos se realizó

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosSelectFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SearchFlightResult implements Question<Boolean>{
	
    private static String errorMessage = "No hay vuelos con las caracteristicas buscadas";
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Retorna un true si el elemento BOTON_RESERVAR es visible para el actor
		 return the(TiquetesBaratosSelectFlightPage.RESERV_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}

	//Constructor de la clase	
	public static SearchFlightResult page() {
		return new SearchFlightResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}

}
