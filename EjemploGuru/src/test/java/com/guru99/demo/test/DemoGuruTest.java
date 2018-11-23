package com.guru99.demo.test;

//Test para ingresar usuario y contraseña en Guru99, validar que el usuario sea el ingresado
//Crear nuevo customer, y validar el nombre del nuevo customer
//Hamcrest es un framework que ayuda a escribir pruebas de software en el lenguaje de programación Java

//import org.junit.Assert;      //Libreria para hacer validaciones con Assert y JUnit
import static org.hamcrest.CoreMatchers.*;          //Libreria para usar los metodos de hamcres (is,equalTo)
import static org.hamcrest.MatcherAssert.assertThat; //Libreria para hacer validaciones con Assert y Hamcrest
import org.junit.After;         //Metodo que se ejecuta despues del test
import org.junit.Before;        //Metodo que se ejecuta antes del test
import org.junit.Test;          //Metodo que se ejecuta durante la prueba


import com.guru99.demo.pages.DemoGuruPOM;


public class DemoGuruTest {
	
	DemoGuruPOM Guru = new DemoGuruPOM(); //Crear objeto de tipo POM para el uso de los metodos

	@Before
	public void setUp() throws Exception {
		Guru.OpenBrowser("http://demo.guru99.com/V4/index.php"); //Metodo para abrir el navegador en la pagina que se le indica
	}

	@After
	public void tearDown() throws Exception {
		//Guru.CloseBrowser(); //Metodo para cerrar el navegador
	}

	@Test
	public void test() {
		Guru.PressButton("btnReset"); //Limpiar el formulario
		Guru.SendText("mngr162502", "uid"); //Llenar campo id
		Guru.SendText("zurapAs", "password"); //Llenar campo contraseña
		Guru.PressButton("btnLogin"); //Presionar boton 
		
		//Validacion del ID usando Assert y JUnit
		//Assert.assertEquals("Manger Id : mngr162502", Guru.GetElement("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
		
		//Validacion del ID usando Assert y Hamcrest
		assertThat(Guru.GetElement("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"), is(equalTo("Manger Id : mngr162502")));
		
		Guru.PressButton2("/html/body/div[3]/div/ul/li[2]/a"); //Click en la pestaña crear nuevo customer
		Guru.PressButton("res"); //Limpiar formulario
		Guru.SendText("Camila", "name");
		Guru.SendText("2141999", "dob");
		Guru.SendText("Calle 1", "addr");
		Guru.SendText("Bello", "city");         //Llenado de formulario crear customer
		Guru.SendText("Antioquia", "state");
		Guru.SendText("738473", "pinno");
		Guru.SendText("3122234456", "telephoneno");
		Guru.SendText("cami35@gmail.com", "emailid");
		Guru.SendText("rfgf23", "password");
		Guru.PressButton("sub");
		
		//Validacion del nombre usando Assert y JUnit
		//Assert.assertEquals("Andres", Guru.GetElement("//*[@id=\"customer\"]/tbody/tr[5]/td[2]"));
		
		//Validacion del nombre usando Assert y Hamcrest
		assertThat(Guru.GetElement("//*[@id=\"customer\"]/tbody/tr[5]/td[2]"), is(equalTo("Andres")));
		//assertThat(x, equalTo(y));
		//assertThat(x, is(y));
		//assert_that(x, is_not(equal_to(y)))
	}
}
