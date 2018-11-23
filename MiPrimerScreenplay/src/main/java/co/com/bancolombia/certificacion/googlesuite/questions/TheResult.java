package co.com.bancolombia.certificacion.googlesuite.questions;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(GoogleTranslatePage.TARGET_LENGUAGE_RESULT).viewedBy(actor).asString();
	}

	public static TheResult is() {
		return new TheResult();
	}

}
