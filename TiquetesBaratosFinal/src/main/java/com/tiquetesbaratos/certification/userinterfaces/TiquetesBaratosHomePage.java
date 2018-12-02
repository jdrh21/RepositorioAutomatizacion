package com.tiquetesbaratos.certification.userinterfaces;

//En esta clase establecemos la URL que deseamos usar para los test

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//Establecemos la url que deseamos usar
//Extiende de PageObject con el objetivo de usar el metodo OpenBrowser, el cual recibe un PageObject

@DefaultUrl("https://www.tiquetesbaratos.com/")
public class TiquetesBaratosHomePage extends PageObject{

}
