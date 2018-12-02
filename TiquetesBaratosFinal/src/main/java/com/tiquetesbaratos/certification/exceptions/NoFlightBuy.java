package com.tiquetesbaratos.certification.exceptions;

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
