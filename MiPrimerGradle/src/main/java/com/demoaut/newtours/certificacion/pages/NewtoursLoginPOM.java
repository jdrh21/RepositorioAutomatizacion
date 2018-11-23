package com.demoaut.newtours.certificacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursLoginPOM {
	
	WebDriver bot;
	
	public void OpenBrowser(String txt){
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");// Linea para indicar donde esta el controlador para chrome		
		bot = new ChromeDriver();//Creamos nuestro robot y abrimos navegador
		bot.get(txt); //Linea para abrir el URL indicado (google)
	}
	
	public void CloseBrowser() {
		bot.close(); //Linea para cerrar el navegador
	}
	
	public void SendText(String txt) {
		bot.findElement(By.name("q")).sendKeys(txt); //Para ubicar la barra de texto por Name, y le enviamos un texto mediante sendKeys para buscar
	}
	
	public void PressEscape() {
		bot.findElement(By.name("q")).sendKeys(Keys.ESCAPE); //Para que presione escape y se cierre la lista desplegable de google
	}
	
	public void PressSearchButton() {
		bot.findElement(By.name("btnK")).click(); // Para hacer click en el boton buscar
	}

}
