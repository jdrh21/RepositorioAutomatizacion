package com.tiquetesbaratos.certification.userinterfaces;

//En esta clase realizamos el mapeo de los componentes de la pagina principal de tiquetesbaratos.com


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TiquetesBaratosComponents {
	public static final Target ALERT = Target.the("Alerta de notificaciones").located(By.id("onesignal-popover-container"));
	public static final Target CANCEL_ALERT = Target.the("cancelar Alerta de notificaciones").located(By.id("onesignal-popover-cancel-button"));
	public static final Target LOGO = Target.the("Logo pagina principal").located(By.xpath("//*[@id=\"cabecera\"]/table/tbody/tr[1]/td[1]/a/div"));
	public static final Target FROM_FIELD = Target.the("Campo origen de vuelo").located(By.name("origen"));
	public static final Target FROM = Target.the("Elemento de la lista origen de vuelo").located(By.linkText("Medellin - Colombia(MDE)"));
	public static final Target TO_FIELD = Target.the("Campo destino de vuelo").located(By.name("destino"));
	public static final Target TO = Target.the("Elemento de la lista destino de vuelo").located(By.linkText("Bogota - Colombia (BOG)"));
	public static final Target DATE1_FIELD = Target.the("Campo fecha vuelo de ida").located(By.name("from"));
	public static final Target DATE1 = Target.the("Elemento del calendario fecha ida enero23").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a"));
	public static final Target DATE2_FIELD = Target.the("Campo fecha vuelo de regreso").located(By.name("to"));
	public static final Target DATE2 = Target.the("Elemento del calendario fecha regreso feb21").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[5]/a"));
	public static final Target SEARCH_BUTTON = Target.the("Botón buscar").located(By.id("btn_buscarmotor"));
}
