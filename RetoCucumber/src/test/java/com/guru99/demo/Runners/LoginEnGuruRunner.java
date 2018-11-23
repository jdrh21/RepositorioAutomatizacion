package com.guru99.demo.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/LoginEnGuru.Feature",
glue="com.guru99.demo.StepsDefinitios",tags="@tag1",
plugin ={"pretty" , "html:Reporte/"})

public class LoginEnGuruRunner {

}
