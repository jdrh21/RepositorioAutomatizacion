package com.tiquetesbaratos.certification.exceptions;

//Excepcion que controla si los vuelos seleccionados no se pueden reservar

public class NoFlightSelected extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	private static final String NO_FLIGHT_SELECTED = "No se seleccionaron vuelos";
	public static String getNoFlightSelectedMessage() {
		return NO_FLIGHT_SELECTED;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NoFlightSelected(String message, Throwable cause) {
		super(message, cause);
	}
}
