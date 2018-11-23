package com.newtours.certificacion.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="Features/NewTours.Feature",
glue="com.newtours.certificacion.StepsDefinitions",
plugin ={"pretty" , "html:Reporte/"})

public class NewToursRunner {

}