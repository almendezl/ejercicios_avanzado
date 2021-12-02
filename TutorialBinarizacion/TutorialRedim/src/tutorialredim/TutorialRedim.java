/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialredim;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import javax.imageio.ImageIO;



/**
 *
 * @author Geek
 */
public class TutorialRedim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Imagen obj = new Imagen("entrada.jpg");
        obj.binarizarImagen(100);
        BufferedImage img = obj.imprimirImagen();
        ImageIO.write(img, "jpg", new File("salida.jpg"));
        
        
    }
}
