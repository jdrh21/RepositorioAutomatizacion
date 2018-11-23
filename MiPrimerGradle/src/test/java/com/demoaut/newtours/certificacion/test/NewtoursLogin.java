package com.demoaut.newtours.certificacion.test;

//import static org.junit.Assert.*; // Sirve para hacer validaciones
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.demoaut.newtours.certificacion.pages.NewtoursLoginPOM;

public class NewtoursLogin {
	NewtoursLoginPOM x = new NewtoursLoginPOM();
	
	@Before
	public void setUp() throws Exception {		
		try {
		x.OpenBrowser("http://www.google.com");		
		}catch(Exception e) {
		    System.out.println("ERROR: No se pudo abrir el navegador");
		}
	}

	@After
	public void tearDown() throws Exception {				
		x.CloseBrowser();				
	}

	@Test
	public void test() {
		try {
        x.SendText("Suso");
		x.PressEscape();
		x.PressSearchButton();
		}catch(Exception e) {
		    System.out.println("ERROR: No se pudo realizar la busqueda");
		}
	}
}
