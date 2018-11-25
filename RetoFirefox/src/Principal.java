//Clase para abrir navegador Firefox, ir a google y buscar una cadena
//Se importan las librerias Selenium webdriver y FireFoxDriver

import org.openqa.selenium.firefox.FirefoxDriver;// Libreria para abrir navegador
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; // Libreria para localizar por...

public class Principal {

	public static void main(String[] args) {
		// Linea para indicar donde esta el controlador para Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		
		//Creamos nuestro robot
		WebDriver bot = new FirefoxDriver();
		//En este punto, se ha logrado abrir el navegador
		
		bot.get("http://www.google.com"); //Linea para abrir el URL indicado (google)
		
		bot.findElement(By.name("q")).sendKeys("Suso"); //Para ubicar la barra de texto por Name, y le enviamos un texto mediante sendKeys para buscar
		
	}

}
