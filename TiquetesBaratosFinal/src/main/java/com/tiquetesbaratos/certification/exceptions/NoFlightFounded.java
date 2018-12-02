package com.tiquetesbaratos.certification.exceptions;

//Excepcion para controlar si no se encuentran los vuelos buscados

public class NoFlightFounded extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	private static final String NO_FLIGHT_FOUNDED = "No se encontraron vuelos";
	public static String getNoFlightFoundedMessage() {
		return NO_FLIGHT_FOUNDED;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NoFlightFounded(String message, Throwable cause) {
		super(message, cause);
	}
}
