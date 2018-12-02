package com.tiquetesbaratos.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tiquetesbaratos.certification.models.CreditCardModel;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosPayFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class BuyFlight implements Task{
	
    //Objeto de tipo ReservationModel que recibe los datos
	private CreditCardModel cardModel;

	//Constructor
	public BuyFlight(CreditCardModel cardModel) {
		this.cardModel = cardModel;
	}

@Override
@Step("{0} fill all the pay form fields")
public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(
			
			//El actor llena el formulario de pago de vuelo con datos de la tarjeta
			Enter.theValue(cardModel.getNombre()).into(TiquetesBaratosPayFlightPage.NOMBRE),
			Enter.theValue(cardModel.getApellido()).into(TiquetesBaratosPayFlightPage.APELLIDO),
			Enter.theValue(cardModel.getNroTarjeta()).into(TiquetesBaratosPayFlightPage.TARJETA),
			Click.on(TiquetesBaratosPayFlightPage.CAMPO_CUOTAS),
			Click.on(TiquetesBaratosPayFlightPage.CUOTAS),
			Click.on(TiquetesBaratosPayFlightPage.CAMPO_MES),
			Click.on(TiquetesBaratosPayFlightPage.MES),
			Click.on(TiquetesBaratosPayFlightPage.CAMPO_ANO),
			Click.on(TiquetesBaratosPayFlightPage.ANO),
			Enter.theValue(cardModel.getDigSeguridad()).into(TiquetesBaratosPayFlightPage.DIGITOS),
			Scroll.to(TiquetesBaratosPayFlightPage.TIPO_DOCUMENTO),
			Click.on(TiquetesBaratosPayFlightPage.TIPO_DOCUMENTO),
			Click.on(TiquetesBaratosPayFlightPage.TIPO_DOCUMENTO_CEDULA),
			Enter.theValue(cardModel.getCedula()).into(TiquetesBaratosPayFlightPage.CEDULA),
	        Enter.theValue(cardModel.getDireccion()).into(TiquetesBaratosPayFlightPage.DIRECCION),
	        Enter.theValue(cardModel.getCiudad()).into(TiquetesBaratosPayFlightPage.CIUDAD),
	        Enter.theValue(cardModel.getCorreo()).into(TiquetesBaratosPayFlightPage.CORREO),
            Enter.theValue(cardModel.getTelefono()).into(TiquetesBaratosPayFlightPage.CELULAR),
	        Click.on(TiquetesBaratosPayFlightPage.PAGAR));
}

public static BuyFlight doit(CreditCardModel cardModel) {
	return instrumented(BuyFlight.class, cardModel); //Equivalente a decir new Reservation
}
}
