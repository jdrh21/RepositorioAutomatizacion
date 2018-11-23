package com.youtube.certificacion.test;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.youtube.certificacion.pages.YoutubePOM;

public class YoutubeTestChrome {
	YoutubePOM x = new YoutubePOM(); //Se crea objeto de tipo YoutubePOM para el uso de los metodos que contienen los comandos

	@Before
	public void setUp() throws Exception {
		try {
			x.OpenBrowser("http://www.youtube.com","Chrome");	//Se usa metodo OpenBrowser de la clase YoutubePOM para abrir navegador	indicado
			}catch(Exception e) {
			    System.out.println("ERROR: No se pudo abrir el navegador");
			}
	}

	@After
	public void tearDown() throws Exception {
		x.CloseBrowser();  //Se usa metodo CLoseBrowser de la clase YoutubePOM para cerrar el navegador
	}

	@Test
	public void test() {
		try {
	        x.SendText("Java"); //Se usa metodo CLoseBrowser de la clase YoutubePOM para indicar el texto a buscar
			x.PressEscape(); //Se usa metodo PressEscape de la clase YoutubePOM para presionar la tecla ESCAPE
			x.PressSearchButton(); //Se usa metodo PressSearchButton de la clase YoutubePOM para Presionar el boton de buscar
			}catch(Exception e) {
			    System.out.println("ERROR: No se pudo realizar la busqueda");
			}
	}

}
