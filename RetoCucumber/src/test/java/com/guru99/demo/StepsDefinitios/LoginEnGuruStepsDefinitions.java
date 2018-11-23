package com.guru99.demo.StepsDefinitios;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.guru99.demo.pages.DemoGuruPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginEnGuruStepsDefinitions {
	DemoGuruPOM Robot = new DemoGuruPOM();
	@Given("Quiero abrir el navegador")
	public void quiero_abrir_el_navegador() {
	    Robot.OpenBrowser();
	}

	@When("Voy a Guru")
	public void voy_a_Guru() {
	    Robot.GoToURL("http://demo.guru99.com/V4/index.php");
	}

	@When("Inicio sesion")
	public void inicio_sesion() {
		Robot.PressButton("btnReset"); //Limpiar el formulario
		Robot.SendText("mngr162502", "uid"); //Llenar campo id
		Robot.SendText("zurapAs", "password"); //Llenar campo contraseña
		Robot.PressButton("btnLogin"); //Presionar boton 
	}

	@Then("Valido que el usuario coincida")
	public void valido_que_el_usuario_coincida() {
		//Validacion del ID usando Assert y Hamcrest
		Robot.TakeScreenShot();
		assertThat(Robot.GetElement("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"), is(equalTo("Manger Id : mngr162502")));
	}

}
