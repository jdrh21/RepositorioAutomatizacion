package com.tiquetesbaratos.certification.exceptions;

/*
 CLASE QUE CONTIENE UNA EXCEPCION EN CASO DE QUE FALLE EL TEST DESPUES DE TRATAR DE COMPRAR LOS VUELOS
 */

/*Motivo de la variable "serialVersionUID": Algunos entornos de desarrollo, como eclipse, dan un warning si una clase que 
implementa Serializable (o hereda de una clase que a su vez implementa Serializable) no tiene 
definido este campo. Es m�s, puede generarlo autom�ticamente, n�mero incluido, si se lo pedimos. 
En eclipse basta con hacer click con el rat�n sobre el s�mbolo de warning para que nos de las 
posibles soluciones al warning. Una de ellas genera el n�mero autom�ticamente.*/

public class NoFlightBuy extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	private static final String NO_FLIGHT_BUY = "No se compraron los vuelos";
	public static String getNoFlightBuyMessage() {
		return NO_FLIGHT_BUY;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NoFlightBuy(String message, Throwable cause) {
		super(message, cause);
	}
}
