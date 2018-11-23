package com.guru99.demo.pages;

//Clase que contiene el POM con los metodos necesarios para manipular paginas web en google chrome

import org.openqa.selenium.By;  //Libreria para localizar elementos
import org.openqa.selenium.WebDriver; //Controlador web
import org.openqa.selenium.WebElement; // Libreria para manipular elementos de la pagina
import org.openqa.selenium.chrome.ChromeDriver; //Controlador de google chrome

public class DemoGuruPOM {
	
	WebDriver bot; // Declaracion del robot
	
	public void OpenBrowser(String txt){ // La variable txt es el texto que se desea buscar		
			System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");// Linea para indicar donde esta el controlador para chrome		
			bot = new ChromeDriver();//Creamos nuestro robot y abrimos navegador
			bot.get(txt); //Linea para abrir el URL indicado		
	}
	
	public void CloseBrowser() {
		bot.close(); //Linea para cerrar el navegador
	}
	
	public void SendText(String txt, String element) {
		bot.findElement(By.name(element)).sendKeys(txt); //Para ubicar un elemento por Name, y le enviamos un texto mediante sendKeys
	}
	
	public void PressButton(String Element) {
		bot.findElement(By.name(Element)).click(); // Para hacer click en el boton buscado por nombre
	}
	
	public void PressButton2(String Element) {
		bot.findElement(By.xpath(Element)).click(); // Para hacer click en el boton buscado por xpath
	}
	
	public String GetElement(String element) {
		WebElement id= bot.findElement(By.xpath(element));  //Para capturar el texto de un elemento mostrado en pantalla
		return id.getText();
	}

}
