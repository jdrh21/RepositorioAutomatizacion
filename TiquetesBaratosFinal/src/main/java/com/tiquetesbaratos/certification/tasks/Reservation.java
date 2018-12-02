package com.tiquetesbaratos.certification.tasks;

//Clase de tipo tarea encargada de ingresar los datos del cliente para realizar la reserva y elegir el medio de pago

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tiquetesbaratos.certification.models.ReservationModel;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosPayFlightPage;
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosReservationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class Reservation implements Task{
	
	    //Objeto de tipo ReservationModel que recibe los datos
		private ReservationModel reservationModel;

		//Constructor
		public Reservation(ReservationModel reservationModel) {
			this.reservationModel = reservationModel;
		}

	@Override
	@Step("{0} fill all the form fields")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				//El actor llena el formulario de reserva de vuelo con datos del cliente
				
				Enter.theValue(reservationModel.getPrimerNombre()).into(TiquetesBaratosReservationPage.FIRST_NAME),
				Enter.theValue(reservationModel.getPrimerApellido()).into(TiquetesBaratosReservationPage.LAST_NAME),
				Click.on(TiquetesBaratosReservationPage.DAY_FIELD),
				Click.on(TiquetesBaratosReservationPage.DAY),
				Click.on(TiquetesBaratosReservationPage.MONTH_FIELD),
				Click.on(TiquetesBaratosReservationPage.MONTH),
				Click.on(TiquetesBaratosReservationPage.YEAR_FIELD),
				Click.on(TiquetesBaratosReservationPage.YEAR),
				Enter.theValue(reservationModel.getCedula()).into(TiquetesBaratosReservationPage.ID),
		        Enter.theValue(reservationModel.getTelefono()).into(TiquetesBaratosReservationPage.PHONE),
		        Enter.theValue(reservationModel.getCelular()).into(TiquetesBaratosReservationPage.CELLPHONE),
		        Enter.theValue(reservationModel.getCorreo1()).into(TiquetesBaratosReservationPage.MAIL),
                Enter.theValue(reservationModel.getCorreo2()).into(TiquetesBaratosReservationPage.MAIL1),
                Click.on(TiquetesBaratosReservationPage.RESERV_BUTTON),
                WaitUntil.the(TiquetesBaratosPayFlightPage.VISA, WebElementStateMatchers.isVisible()),
    			Click.on(TiquetesBaratosPayFlightPage.VISA));
	}
	
	public static Reservation doit(ReservationModel reservationModel) {
		return instrumented(Reservation.class, reservationModel); //Equivalente a decir new Reservation
	}
}
