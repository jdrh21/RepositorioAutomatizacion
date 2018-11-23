package co.com.google.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features/BuscarEnGoogle.Feature",
glue="co.com.google.StepsDefinitions",tags="@tag1",
plugin ={"pretty" , "html:Reporte/"})

public class BuscarEnGoogleRunner {
	
	

}
