package com.google.certificacion.traducirengoogle.test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static org.hamcrest.CoreMatchers.equalTo;
//import org.junit.After;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.google.certificacion.traducirengoogle.questions.TheResult;
import com.google.certificacion.traducirengoogle.tasks.GoTo;
import com.google.certificacion.traducirengoogle.tasks.OpenTheBrowser;
import com.google.certificacion.traducirengoogle.tasks.Translate;
import com.google.certificacion.traducirengoogle.userinterfaces.GoogleAppsComponent;
import com.google.certificacion.traducirengoogle.userinterfaces.GoogleHomePage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)


public class TestTraducirEnGoogle {
	
	@Managed(driver = "chrome") //Le indicamos al WebDriver que use el de chrome
	public WebDriver hisBrowser; //Declaramos el webdriver
	
    public Actor Daniel = Actor.named("Daniel"); //Declaramos el actor, usando el metodo estatico named en vez de new
	
	public GoogleHomePage googleHomePage; //Declaramos un objeto con la clase que contiene la URL

	@Before
	public void setUp() throws Exception {
		Daniel.can(BrowseTheWeb.with(hisBrowser)); //Le indicamos al actor que puede navegar en la web mediante el webdriver
	}
	
	
	@Test
	public void test() {
		givenThat(Daniel).attemptsTo(OpenTheBrowser.on(googleHomePage));//Se usa el metodo wasAbleTo de Actor para indicarle lo que pudo hacer
		when(Daniel).attemptsTo(GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));//Se usa el metodo wasAble para indicar que el actor fue capaz de "ir" a la aplicacion
		when(Daniel).attemptsTo(Translate.the());
		then(Daniel).should(seeThat(TheResult.is(), equalTo("Queso")));
	}

}
