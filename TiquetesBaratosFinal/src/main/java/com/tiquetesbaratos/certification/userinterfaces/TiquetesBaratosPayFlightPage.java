package com.tiquetesbaratos.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TiquetesBaratosPayFlightPage {
	
	//En esta clase realizamos el mapeo de los componentes de la pagina de pago de vuelo
	
	public static final Target VISA = Target.the("Medio de pago visa").located(By.id("visagrande"));
	public static final Target NOMBRE = Target.the("nombre").located(By.id("titular"));
    public static final Target APELLIDO = Target.the("apellido").located(By.id("apellidotc"));
    public static final Target TARJETA = Target.the("Numero de tarjeta").located(By.id("tarjeta"));
    public static final Target CAMPO_CUOTAS = Target.the("Campo cuotas tarjeta").located(By.id("cuotas"));
    public static final Target CUOTAS = Target.the("valor cuotas").located(By.xpath("//*[@id=\"cuotas\"]/option[4]"));
    public static final Target CAMPO_MES = Target.the("Campo Mes vencimiento").located(By.id("mesvencimiento"));
    public static final Target MES = Target.the("valor mes vencimiento").located(By.xpath("//*[@id=\"mesvencimiento\"]/option[3]"));
    public static final Target CAMPO_ANO = Target.the("Campo año vencimiento").located(By.id("anovencimiento"));
    public static final Target ANO = Target.the("Valor año vencimiento").located(By.xpath("//*[@id=\"anovencimiento\"]/option[4]"));
    public static final Target DIGITOS = Target.the("Digitos de seguridad").located(By.id("digitosseguridad"));
    public static final Target TIPO_DOCUMENTO = Target.the("Tipo de documento").located(By.id("tipoid"));
    public static final Target TIPO_DOCUMENTO_CEDULA = Target.the("Documento tipo cedula").located(By.xpath("//*[@id=\"tipoid\"]/option[2]"));
    public static final Target CEDULA = Target.the("Cedula").located(By.id("numeroidentificacion"));
    public static final Target DIRECCION = Target.the("Direccion").located(By.id("direccion"));
    public static final Target CIUDAD = Target.the("Ciudad de cobro").located(By.id("ciudadcobro"));
    public static final Target CORREO = Target.the("Correo").located(By.id("correo"));
    public static final Target CELULAR = Target.the("Celular").located(By.id("celular"));
    public static final Target PAGAR = Target.the("Boton pagar").located(By.id("guardar"));
    public static final Target IMPRIMIR = Target.the("Boton imprimir").located(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[7]/td/table/tbody/tr/td[1]/input"));
}