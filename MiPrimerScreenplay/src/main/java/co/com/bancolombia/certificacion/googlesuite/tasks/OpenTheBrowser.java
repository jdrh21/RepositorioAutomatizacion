package co.com.bancolombia.certificacion.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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
	@Step("{0} opens the browser on Google Home Page") //El cero entre llaves es el actor, esta linea se indica para que el texto salga en el informe
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page)); //Metodo para realizar las interacciones, browserOn recibe un page object, por lo que creamos una nueva clase que extiende de PageObject
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page); //Metodo de serenity para instanciar
	}

}
