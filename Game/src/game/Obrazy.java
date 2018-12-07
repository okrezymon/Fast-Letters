
package game;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Obrazy {
    
    public static Image bgImage;
    
    public static void loadInitialImages() {
        
        bgImage = loadImage("tlo4.jpg");
        
    }
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }    
}
