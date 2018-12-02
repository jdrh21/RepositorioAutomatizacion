package com.tiquetesbaratos.certification.tasks;

//Clase de tipo tarea encargada de ingresar los datos del cliente para realizar la reserva

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
				
				Enter.theValue(reservationModel.getPrimerNombre()).into(TiquetesBaratosReservationPage.PRIMER_NOMBRE),
				Enter.theValue(reservationModel.getPrimerApellido()).into(TiquetesBaratosReservationPage.PRIMER_APELLIDO),
				Click.on(TiquetesBaratosReservationPage.CAMPO_DIA),
				Click.on(TiquetesBaratosReservationPage.DIA),
				Click.on(TiquetesBaratosReservationPage.CAMPO_MES),
				Click.on(TiquetesBaratosReservationPage.MES),
				Click.on(TiquetesBaratosReservationPage.CAMPO_ANO),
				Click.on(TiquetesBaratosReservationPage.ANO),
				Enter.theValue(reservationModel.getCedula()).into(TiquetesBaratosReservationPage.CEDULA),
		        Enter.theValue(reservationModel.getTelefono()).into(TiquetesBaratosReservationPage.TELEFONO),
		        Enter.theValue(reservationModel.getCelular()).into(TiquetesBaratosReservationPage.CELULAR),
		        Enter.theValue(reservationModel.getCorreo1()).into(TiquetesBaratosReservationPage.CORREO),
                Enter.theValue(reservationModel.getCorreo2()).into(TiquetesBaratosReservationPage.CORREO1),
                Click.on(TiquetesBaratosReservationPage.BOTON_RESERVAR),
                WaitUntil.the(TiquetesBaratosPayFlightPage.VISA, WebElementStateMatchers.isVisible()),
    			Click.on(TiquetesBaratosPayFlightPage.VISA));
	}
	
	public static Reservation doit(ReservationModel reservationModel) {
		return instrumented(Reservation.class, reservationModel); //Equivalente a decir new Reservation
	}
}
