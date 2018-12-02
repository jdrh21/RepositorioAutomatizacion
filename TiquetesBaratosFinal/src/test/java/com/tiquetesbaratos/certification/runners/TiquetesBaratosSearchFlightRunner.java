package com.tiquetesbaratos.certification.runners;

//Mediante esta clase se ejecuta el test de buscar vuelos


//Libreria para implementar el metodo RunWith que permite ejecutar los test
import org.junit.runner.RunWith;
//Libreria para especificar caracteristicas de la ejecucion del test como la ubicacion del feature
import cucumber.api.CucumberOptions;
//Libreria para determinar la sintaxis que desea para los metodos generados por los features
import cucumber.api.SnippetType;
//Libreria que establece que los test se ejecutaran usando cucumber y serenity
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		//Establecemos la ruta del feature que deseamos ejecutar
		features = "src/test/resources/features/search_flight.feature",
		//Establecemos la ruta del paquete que contiene TODOS los steps definitions
		glue = "com.tiquetesbaratos.certification.stepsdefinitions",
		//Indicamos que implemente la sintaxis CamelCase
		snippets = SnippetType.CAMELCASE
)

public class TiquetesBaratosSearchFlightRunner {

}
