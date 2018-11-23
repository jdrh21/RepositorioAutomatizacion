package com.newtours.certificacion.pages;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	NewToursPOM pom = new NewToursPOM();
	String usuario = "Jose";
	String password = "123";
	
	@Step
	public void OpenApplication() {
		pom.open();
	}
	
	@Step("Escribiendo datos")
	public void EscribirDatos() {
		pom.writeData("usuario","123");
	}
	
	@Step("Enviando datos")
	public void EviarDatos() {
		pom.sendData();
	}

}
