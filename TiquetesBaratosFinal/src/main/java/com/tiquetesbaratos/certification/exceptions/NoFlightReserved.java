package com.tiquetesbaratos.certification.exceptions;

//Excepcion para controlar si no se reservan los vuelos seleccionados

public class NoFlightReserved extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	private static final String NO_FLIGHT_RESERVED = "No se reservaron los vuelos";
	public static String getNoFlightReservedMessage() {
		return NO_FLIGHT_RESERVED;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NoFlightReserved(String message, Throwable cause) {
		super(message, cause);
	}
}
