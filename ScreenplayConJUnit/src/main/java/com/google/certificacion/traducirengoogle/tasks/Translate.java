package com.google.certificacion.traducirengoogle.tasks;

import com.google.certificacion.traducirengoogle.userinterfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LENGUAGE_OPTION),
        		Click.on(GoogleTranslatePage.SOURCE_LENGUAGE),
        		Click.on(GoogleTranslatePage.TARGET_LENGUAGE_OPTION),
        		Click.on(GoogleTranslatePage.TARGET_LENGUAGE),
        		Enter.theValue("Cheese").into(GoogleTranslatePage.SOURCE_LENGUAGE_TEXTAREA),
        		Click.on(GoogleTranslatePage.TRANSLATE_BUTTON));
        		
	}

	public static Translate the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Translate.class);
	}

}
