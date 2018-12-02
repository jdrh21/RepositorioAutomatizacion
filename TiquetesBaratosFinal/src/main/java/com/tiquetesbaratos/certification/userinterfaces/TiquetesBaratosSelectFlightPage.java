package com.tiquetesbaratos.certification.userinterfaces;


//En esta clase realizamos el mapeo de los componentes de la pagina de seleccion de vuelo

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TiquetesBaratosSelectFlightPage {
	
	
	public static final Target VUELO_IDA = Target.the("Vuelo de ida").located(By.id("vueloFC3"));
    public static final Target VUELO_REGRESO = Target.the("Vuelo de regreso").located(By.id("vuelo2FC3"));
    public static final Target BOTON_RESERVAR = Target.the("Boton reservar").located(By.xpath("//*[@id=\"caja_flotante\"]/table/tbody/tr[2]/td/table/tbody/tr/td/div"));

}