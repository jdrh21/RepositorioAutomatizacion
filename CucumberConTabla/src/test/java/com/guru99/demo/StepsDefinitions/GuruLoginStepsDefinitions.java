package com.guru99.demo.StepsDefinitions;
import com.guru99.demo.pages.GuruLoginPOM;


//Librerias hamcrest para hacer validaciones
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

//Librerias cucumber para usar las anotaciones
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruLoginStepsDefinitions {
	
	GuruLoginPOM bot = new GuruLoginPOM();
	
	@Given("^Abro el navegador$")
	public void abro_el_navegador() throws Throwable {
	    bot.OpenBrowser();
	    Thread.sleep(3000);
	}

	@When("^Voy a Guru$")
	public void voy_a_Guru() throws Throwable {
	    bot.GoToURL("http://demo.guru99.com/V4/index.php");
	    Thread.sleep(3000);
	}

	
	@When("^Quiero iniciar sesion con el nombre \"([^\"]*)\"$")
	public void quiero_iniciar_sesion_con_el_nombre(String id) throws Throwable {
		bot.PressButton("btnReset"); //Limpiar el formulario
		bot.SendText(id, "uid"); //Llenar campo id
		Thread.sleep(3000);		
	}

	@When("^La clave es \"([^\"]*)\"$")
	public void la_clave_es(String password) throws Throwable {
		bot.SendText(password, "password"); //Llenar campo contraseña
		Thread.sleep(3000);
		bot.PressButton("btnLogin"); //Presionar boton
	}


	@Then("^Verifico el resultado success$")
	public void verifico_el_resultado_success() throws Throwable {
		Thread.sleep(3000);
		assertThat(bot.GetElement("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"), is(equalTo("Manger Id : mngr162502")));
		bot.CloseBrowser();
	}
	
	@Then("^Verifico el resultado fail$")
	public void verifico_el_resultado_fail() throws Throwable {
		Thread.sleep(3000);
		bot.Alerta();
		Thread.sleep(3000);
		bot.CloseBrowser();
	}
}
