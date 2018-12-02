package com.tiquetesbaratos.certification.questions;

//Clase que retorna un booleano dependiendo si un elemento es visible para el actor
//Confirma que la compra del vuelo se realizó

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosPayFlightPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BuyFlightResults implements Question<Boolean>{
	
    private static String errorMessage = "No se pueden comprar estos vuelos";
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//Retorna un true si el elemento IMPRIMIR es visible para el actor
		 return the(TiquetesBaratosPayFlightPage.PRINT).answeredBy(actor).isCurrentlyVisible();
	}

	//Constructor de la clase	
	public static BuyFlightResults page() {
		return new BuyFlightResults();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}

}
