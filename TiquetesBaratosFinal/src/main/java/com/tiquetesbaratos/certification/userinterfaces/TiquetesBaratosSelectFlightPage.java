package com.tiquetesbaratos.certification.userinterfaces;


//En esta clase realizamos el mapeo de los componentes de la pagina de seleccion de vuelo

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TiquetesBaratosSelectFlightPage {
	
	
	public static final Target OUTBOUND_FLIGHT = Target.the("Vuelo de ida").located(By.name("vuelo"));
    public static final Target RETURN_FLIGHT = Target.the("Vuelo de regreso").located(By.name("vuelo2"));
    public static final Target RESERV_BUTTON = Target.the("Boton reservar").located(By.xpath("//*[@id=\"caja_flotante\"]/table/tbody/tr[2]/td/table/tbody/tr/td/div"));

}