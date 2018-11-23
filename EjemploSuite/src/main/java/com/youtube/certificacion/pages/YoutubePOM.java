package com.youtube.certificacion.pages;


import org.openqa.selenium.By; // Libreria para localizar
import org.openqa.selenium.Keys; // Libreria para teclas especiales
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; //Controlador para Chrome
import org.openqa.selenium.firefox.FirefoxDriver; //Controlador para Firefox
import org.openqa.selenium.ie.InternetExplorerDriver;

public class YoutubePOM {
	
	WebDriver bot;
	
	public void OpenBrowser(String txt, String browser){ // La variable txt es el texto que se desea buscar y browser el navegador elegido
		switch(browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");// Linea para indicar donde esta el controlador para chrome		
			bot = new ChromeDriver();//Creamos nuestro robot y abrimos navegador
			bot.get(txt); //Linea para abrir el URL indicado (youtube)
		    break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\geckodriver-v0.23.0-win32\\geckodriver.exe");
			bot = new FirefoxDriver();
			bot.get(txt); //Linea para abrir el URL indicado (youtube)
			break;
		case "Explorer":
			System.setProperty("webdriver.ie.driver", "C:\\SELENIUM\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
			bot = new InternetExplorerDriver();
			bot.get(txt); //Linea para abrir el URL indicado (youtube)
			break;
			
		}
	}
	
	public void CloseBrowser() {
		bot.close(); //Linea para cerrar el navegador
	}
	
	public void SendText(String txt) {
		bot.findElement(By.name("search_query")).sendKeys(txt); //Para ubicar la barra de texto por Name, y le enviamos un texto mediante sendKeys para buscar
	}
	
	public void PressEscape() {
		bot.findElement(By.name("search_query")).sendKeys(Keys.ESCAPE); //Para que presione escape y se cierre la lista desplegable de google
	}
	
	public void PressSearchButton() {
		bot.findElement(By.id("search-icon-legacy")).click(); // Para hacer click en el boton buscar
	}

}
