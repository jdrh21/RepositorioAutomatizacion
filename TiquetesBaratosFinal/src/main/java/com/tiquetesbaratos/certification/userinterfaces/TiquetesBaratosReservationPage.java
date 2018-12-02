package com.tiquetesbaratos.certification.userinterfaces;

//En esta clase realizamos el mapeo de los componentes de la pagina de reserva


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TiquetesBaratosReservationPage {
	
	public static final Target FIRST_NAME = Target.the("Primer nombre").located(By.id("nombreadulto1"));
    public static final Target LAST_NAME = Target.the("Primer apellido").located(By.id("apellidoadulto1"));
    public static final Target DAY_FIELD = Target.the("Campo Dia").located(By.id("dianacimientoadulto1"));
    public static final Target DAY = Target.the("Dia").located(By.xpath("//*[@id=\"dianacimientoadulto1\"]/option[10]"));
    public static final Target MONTH_FIELD = Target.the("Campo Mes").located(By.id("mesnacimientoadulto1"));
    public static final Target MONTH = Target.the("Mes").located(By.xpath("//*[@id=\"mesnacimientoadulto1\"]/option[6]"));
    public static final Target YEAR_FIELD = Target.the("Campo Año").located(By.id("anonacimientoadulto1"));
    public static final Target YEAR = Target.the("Año").located(By.xpath("//*[@id=\"anonacimientoadulto1\"]/option[79]"));
    public static final Target ID = Target.the("Cedula").located(By.id("cedula1"));
    public static final Target PHONE = Target.the("Telefono").located(By.id("telefonoresidencia"));
    public static final Target CELLPHONE = Target.the("Celular").located(By.id("telefonomovil"));
    public static final Target MAIL = Target.the("Primer correo").located(By.id("correo"));
    public static final Target MAIL1 = Target.the("Segundo correo").located(By.id("correo1"));
    public static final Target RESERV_BUTTON = Target.the("Botón reservar").located(By.id("btn_form"));
}
