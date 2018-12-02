package com.tiquetesbaratos.certification.runners;

/*Mediante esta clase se ejecutan los test de buscar vuelo, reservar vuelo y comprar vuelo*/


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		//Establecemos la ruta del feature que deseamos ejecutar
		features = "src/test/resources/features/buy_flight.feature",
		//Establecemos la ruta del paquete que contiene TODOS los steps definitions
		glue = "com.tiquetesbaratos.certification.stepsdefinitions",
		//Indicamos que implemente la sintaxis CamelCase
		snippets = SnippetType.CAMELCASE
)


public class TiquetesBaratosSuiteRunner {

}
