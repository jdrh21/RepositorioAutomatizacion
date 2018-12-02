package com.tiquetesbaratos.certification.exceptions;


//Excepci�n para controlar la conexi�n a internet

public class NoInternetConnection extends AssertionError {
	
	/*Algunos entornos de desarrollo, como eclipse, dan un warning si una clase que 
	  implementa Serializable (o hereda de una clase que a su vez implementa Serializable) no tiene 
	  definido este campo. Es m�s, puede generarlo autom�ticamente, n�mero incluido, si se lo pedimos. 
	  En eclipse basta con hacer click con el rat�n sobre el s�mbolo de warning para que nos de las 
	  posibles soluciones al warning. Una de ellas genera el n�mero autom�ticamente.*/

	private static final long serialVersionUID = 1L;
	private static final String NO_NETWORK_MESSAGE = "Without connection to the network";

	public static String getErrorNetworkMessage() {
		return NO_NETWORK_MESSAGE;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NoInternetConnection(String message, Throwable cause) {
		super(message, cause);
	}

}
