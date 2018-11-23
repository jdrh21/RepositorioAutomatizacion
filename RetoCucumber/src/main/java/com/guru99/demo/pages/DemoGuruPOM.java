package com.guru99.demo.pages;

//Clase que contiene el POM con los metodos necesarios para manipular paginas web en google chrome

import java.awt.Rectangle; //Especifica un area en un espacio coordenado (Dimensiona la pantalla)
import java.awt.Robot; //Su proposito es facilitar los test automatizados 
import java.awt.Toolkit; // es un kit de herramientas de gráficos, interfaz de usuario, y sistema de ventanas independiente de la plataforma original de Java
import java.awt.image.BufferedImage; //Esta subclase describe una imagen con un búfer accesible de datos de imagen
import java.io.File; // nos proporciona información acerca de los archivos, de sus atributos, de los directorios
import javax.imageio.ImageIO; // contiene métodos de conveniencia estática para ubicar ImageReaders y ImageWriters, y realizar codificaciones y decodificaciones simples.

import org.openqa.selenium.By;  //Libreria para localizar elementos
import org.openqa.selenium.WebDriver; //Controlador web
import org.openqa.selenium.WebElement; // Libreria para manipular elementos de la pagina
import org.openqa.selenium.chrome.ChromeDriver; //Controlador de google chrome

public class DemoGuruPOM {
	
	WebDriver bot; // Declaracion del robot
	
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");// Linea para indicar donde esta el controlador para chrome		
		bot = new ChromeDriver();//Creamos nuestro robot y abrimos navegador
		bot.manage().window().maximize();
	}
	
	public void GoToURL(String txt) {
		bot.get(txt); //Linea para abrir el URL indicado (google)
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
	
	public void TakeScreenShot() {
		BufferedImage pantalla=null; //Variable para guardar la imagen del pantallazo
        {
            try {
                Robot robot = new Robot(); //Sentencia que crea el robot encargado de tomar el pantallazo
                pantalla = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); //Sentencia que toma el pantallazo
                File file = new File("Evidencias/captura.jpg"); //Sentencia que crea el archivo
                ImageIO.write(pantalla, "jpg", file); //Sentencia que escribe en el archivo
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}

}
