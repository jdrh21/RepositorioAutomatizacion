//Clase para abrir navegador Chrome, ir a google y buscar una cadena
//Se importan las librerias Selenium webdriver y chromedriver

import org.openqa.selenium.chrome.ChromeDriver; // Libreria para abrir navegador
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; // Libreria para localizar por...

public class MiPrimerClase {

	public static void main(String[] args) {
		// Linea para indicar donde esta el controlador para chrome
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		//Creamos nuestro robot
		WebDriver bot = new ChromeDriver();
		//En este punto, se ha logrado abrir el navegador
		
		bot.get("http://www.google.com"); //Linea para abrir el URL indicado (google)
		
		bot.findElement(By.name("q")).sendKeys("Suso"); //Para ubicar la barra de texto por Name, y le enviamos un texto mediante sendKeys para buscar
		//Hola mundo
	}

}
