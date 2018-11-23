package com.guru99.demo.pages;
//PAGE OBJECT MODEL QUE CONTIENE LOS METODOS PARA HACER LOGUIN EN GURU99


//Libreria para acceder y manipular los Alerts
import org.openqa.selenium.Alert;
//Libreria para localizar a elementos web
import org.openqa.selenium.By;
//Libreria para crear el robot
import org.openqa.selenium.WebDriver;
//Libreria para manipular elementos web
import org.openqa.selenium.WebElement;
//Libreria para controlar chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruLoginPOM {
	
WebDriver bot; // Declaracion del robot
	
    public void OpenBrowser() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");// Linea para indicar donde esta el controlador para chrome		
	bot = new ChromeDriver();//Creamos nuestro robot y abrimos navegador
	bot.manage().window().maximize();
    }

    public void GoToURL(String txt) {
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
	
	public void Alerta() throws InterruptedException {
		Alert alert = bot.switchTo().alert(); //El robot cambia de la ventana del navegador a el alert
		alert.accept();//Boton aceptar
		//alert.getText();//Obtener el mensaje
		//alert.dismiss();//Boton cancelar
	}
}
