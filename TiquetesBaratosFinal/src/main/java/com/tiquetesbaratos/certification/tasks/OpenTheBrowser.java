package com.tiquetesbaratos.certification.tasks;

//Clase de tipo tarea encargada de abrir el navegador en determinada pagina

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tiquetesbaratos.certification.exceptions.NoInternetConnection;
import com.tiquetesbaratos.certification.questions.TiquetesBaratosPageVisible;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser (PageObject page) {
		this.page = page;
	}

	@Override
	@Step("that {0} is in tiquetes baratos home page") 
	//El cero entre llaves es el actor, esta linea se indica para que salga en el informe
	public <T extends Actor> void performAs(T actor) {
		//Metodo para realizar las interacciones
		//browserOn recibe un page object, creamos una nueva clase que extiende de PageObject
		actor.attemptsTo(Open.browserOn(page)); 
		//Verifica que el logo de tiquetesbaratos sea visible, o arroja error de conexion
		actor.should(seeThat(TiquetesBaratosPageVisible.isVisible()).orComplainWith(NoInternetConnection.class,
		getNoInternetConectionMessage()));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page); 
		//Metodo de serenity para instanciar
	}
	
	public String getNoInternetConectionMessage() {
		return String.format(NoInternetConnection.getErrorNetworkMessage());

	}

}
