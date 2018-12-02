package com.tiquetesbaratos.certification.tasks;

//Clase de tipo tarea encargada de llenar los campos del formulario de pago de vuelos y procede a oprimir el boton pagar


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
			Enter.theValue(cardModel.getNombre()).into(TiquetesBaratosPayFlightPage.NAME),
			Enter.theValue(cardModel.getApellido()).into(TiquetesBaratosPayFlightPage.LASTNAME),
			Enter.theValue(cardModel.getNroTarjeta()).into(TiquetesBaratosPayFlightPage.CARD),
			Click.on(TiquetesBaratosPayFlightPage.CUOTES_FIELD),
			Click.on(TiquetesBaratosPayFlightPage.CUOTES),
			Click.on(TiquetesBaratosPayFlightPage.MONTH_FIELD),
			Click.on(TiquetesBaratosPayFlightPage.MONTH),
			Click.on(TiquetesBaratosPayFlightPage.YEAR_FIELD),
			Click.on(TiquetesBaratosPayFlightPage.YEAR),
			Enter.theValue(cardModel.getDigSeguridad()).into(TiquetesBaratosPayFlightPage.DIGITOS),
			Scroll.to(TiquetesBaratosPayFlightPage.ID_TYPE),
			Click.on(TiquetesBaratosPayFlightPage.ID_TYPE),
			Click.on(TiquetesBaratosPayFlightPage.ID_TYPE_CEDULA),
			Enter.theValue(cardModel.getCedula()).into(TiquetesBaratosPayFlightPage.ID),
	        Enter.theValue(cardModel.getDireccion()).into(TiquetesBaratosPayFlightPage.ADRESS),
	        Enter.theValue(cardModel.getCiudad()).into(TiquetesBaratosPayFlightPage.CITY),
	        Enter.theValue(cardModel.getCorreo()).into(TiquetesBaratosPayFlightPage.MAIL),
            Enter.theValue(cardModel.getTelefono()).into(TiquetesBaratosPayFlightPage.CELULAR),
	        Click.on(TiquetesBaratosPayFlightPage.PAY));
}

public static BuyFlight doit(CreditCardModel cardModel) {
	return instrumented(BuyFlight.class, cardModel); //Equivalente a decir new Reservation
}
}
