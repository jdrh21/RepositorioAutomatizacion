package com.google.certificacion.traducirengoogle.questions;

import com.google.certificacion.traducirengoogle.userinterfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(GoogleTranslatePage.TARGET_LENGUAGE_RESULT).viewedBy(actor).asString();
	}

	public static TheResult is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}

}
