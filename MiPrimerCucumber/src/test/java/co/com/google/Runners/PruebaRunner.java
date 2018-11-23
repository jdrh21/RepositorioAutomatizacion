package co.com.google.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Prueba.Feature",
glue="co.com.google.StepsDefinitions",tags="@tag1")

public class PruebaRunner {
	
	

}
