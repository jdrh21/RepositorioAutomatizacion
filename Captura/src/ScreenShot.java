import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenShot {

	public static void main(String[] args) {
		BufferedImage pantalla=null;
        {
            try {
                Robot robot = new Robot();
                pantalla = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                File file = new File("Capturas/captura.jpg");
                ImageIO.write(pantalla, "jpg", file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


