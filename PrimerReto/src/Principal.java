//Clase para abrir navegador Internet Explorer, ir a google y buscar una cadena
//Se importan las librerias Selenium webdriver e InternetExplorerDriver

import org.openqa.selenium.ie.InternetExplorerDriver;// Libreria para abrir navegador
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; // Libreria para localizar por...
import org.openqa.selenium.Keys; // Libreria para usar teclas especiales como ESCAPE

public class Principal {

	public static void main(String[] args) {
		// Linea para indicar donde esta el controlador para Internet Explorer
		System.setProperty("webdriver.ie.driver", "C:\\SELENIUM\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
				
		//Creamos nuestro robot
		WebDriver bot = new InternetExplorerDriver();
		//En este punto, se ha logrado abrir el navegador
				
		bot.get("http://www.google.com"); //Linea para abrir el URL indicado (google)
				
		bot.findElement(By.name("q")).sendKeys("Suso"); //Para ubicar la barra de texto por Name, y le enviamos un texto mediante sendKeys para buscar
		
		bot.findElement(By.name("q")).sendKeys(Keys.ESCAPE); //Para que presione escape y se cierre la lista desplegable de google
		
		bot.findElement(By.name("btnK")).click(); // Para hacer click en el boton buscar
				
	}

}
