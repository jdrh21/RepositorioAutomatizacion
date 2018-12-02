package com.tiquetesbaratos.certification.userinterfaces;

//En esta clase realizamos el mapeo de los componentes de la pagina de pago de vuelo

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TiquetesBaratosPayFlightPage {
	
	
	public static final Target VISA = Target.the("Medio de pago visa").located(By.id("visagrande"));
	public static final Target NAME = Target.the("nombre").located(By.id("titular"));
    public static final Target LASTNAME = Target.the("apellido").located(By.id("apellidotc"));
    public static final Target CARD = Target.the("Numero de tarjeta").located(By.id("tarjeta"));
    public static final Target CUOTES_FIELD = Target.the("Campo cuotas tarjeta").located(By.id("cuotas"));
    public static final Target CUOTES = Target.the("valor cuotas").located(By.xpath("//*[@id=\"cuotas\"]/option[4]"));
    public static final Target MONTH_FIELD = Target.the("Campo Mes vencimiento").located(By.id("mesvencimiento"));
    public static final Target MONTH = Target.the("valor mes vencimiento").located(By.xpath("//*[@id=\"mesvencimiento\"]/option[3]"));
    public static final Target YEAR_FIELD = Target.the("Campo año vencimiento").located(By.id("anovencimiento"));
    public static final Target YEAR = Target.the("Valor año vencimiento").located(By.xpath("//*[@id=\"anovencimiento\"]/option[4]"));
    public static final Target DIGITOS = Target.the("Digitos de seguridad").located(By.id("digitosseguridad"));
    public static final Target ID_TYPE = Target.the("Tipo de documento").located(By.id("tipoid"));
    public static final Target ID_TYPE_CEDULA = Target.the("Documento tipo cedula").located(By.xpath("//*[@id=\"tipoid\"]/option[2]"));
    public static final Target ID = Target.the("Cedula").located(By.id("numeroidentificacion"));
    public static final Target ADRESS = Target.the("Direccion").located(By.id("direccion"));
    public static final Target CITY = Target.the("Ciudad de cobro").located(By.id("ciudadcobro"));
    public static final Target MAIL = Target.the("Correo").located(By.id("correo"));
    public static final Target CELULAR = Target.the("Celular").located(By.id("celular"));
    public static final Target PAY = Target.the("Boton pagar").located(By.id("guardar"));
    public static final Target PRINT = Target.the("Boton imprimir").located(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[7]/td/table/tbody/tr/td[1]/input"));
}