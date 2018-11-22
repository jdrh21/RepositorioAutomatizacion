package co.com.cinemark.certificacion.compra.questions;

import co.com.cinemark.certificacion.compra.userinterfaces.CineMarkPantallaDeCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CineMarkPantallaDeCompra.CHECK_MOVIE).viewedBy(actor).asString();
	}

	public static TheResult is() {
		return new TheResult();
	}

}
