package com.youtube.certificacion.test;

// Un TestSuite se utiliza para tomar diferentes pruebas unitarias y ejecutarlas de manera agrupada

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //RunWith y Suite son anotaciones utilizadas para ejecutar las pruebas de la suite

@Suite.SuiteClasses({ // se utiliza para indicar que un Test Suite correrá los siguientes test
   YoutubeTestChrome.class,
   YoutubeTestFirefox.class, //Estos son los test que correra la suite
   YoutubeTestExplorer.class
})

public class JUnitTestSuite {

}
