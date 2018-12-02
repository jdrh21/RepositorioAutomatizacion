package com.tiquetesbaratos.certification.questions;

//Clase que retorna un booleano dependiendo si un elemento es visible para el actor
//Confirma que se abrio la pagina principal, con el fin de verificar si hay red

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosComponents;


//Clase para verificar la conexion de internet, verificando el logo de tiquetesbaratos.com


public class TiquetesBaratosPageVisible implements Question<Boolean>  {
	
	//verifica si el boton logo de tiquetesbaratos.com esta visible por el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		//Metodo que arroja una excepcion si un elemento no es visible en pantalla
		return the(TiquetesBaratosComponents.LOGO).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new TiquetesBaratosPageVisible();
	}

}