package com.tiquetesbaratos.certification.tasks;

//Clase de tipo tarea encargada de llenar los campos del formulario buscar vuelos

//Libreria para instanciar objetos de la clase Task
import static net.serenitybdd.screenplay.Tasks.instrumented;
//Libreria que contiene los target de la pagina de busqueda de vuelo
import com.tiquetesbaratos.certification.userinterfaces.TiquetesBaratosComponents;
//Libreria para usar los metodos de la clase Actor
import net.serenitybdd.screenplay.Actor;
//Libreria que implementa el metodo performAs, el cual contiene todas las acciones
import net.serenitybdd.screenplay.Task;
//Libireria para usar la accion Click de serenity
import net.serenitybdd.screenplay.actions.Click;
//Libreria para ingresar datos en un campo de serenity
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;


public class FillSearchFields implements Task{
	
	
	public FillSearchFields() {
	}

	@Override
	@Step("{0} fill all the fields")
	public <T extends Actor> void performAs(T actor) {
		//Metodo mediante el cual el actor llena el formulario de busqueda de vuelo
		actor.attemptsTo(
		WaitUntil.the(TiquetesBaratosComponents.ALERTA, WebElementStateMatchers.isVisible()),
		Click.on(TiquetesBaratosComponents.CANCELAR_ALERTA),
		Enter.theValue("Medellin - Colombia(MDE)").into(TiquetesBaratosComponents.ORIGEN_FIELD),
		Click.on(TiquetesBaratosComponents.ORIGEN),
		Enter.theValue("Bogota - Colombia (BOG)").into(TiquetesBaratosComponents.DESTINO_FIELD),
		Click.on(TiquetesBaratosComponents.DESTINO),
		Click.on(TiquetesBaratosComponents.DATE1_FIELD),
		Click.on(TiquetesBaratosComponents.DATE1),
		Click.on(TiquetesBaratosComponents.DATE2_FIELD),
		Click.on(TiquetesBaratosComponents.DATE2),
		Click.on(TiquetesBaratosComponents.SEARCH_BUTTON));
	}

	public static FillSearchFields fill() {
		return instrumented(FillSearchFields.class); //Equivalente a decir new FillSearchFields
	}

}
