
package game;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Obrazy {
    
    public static Image bgImage;
    
    public static Image bgzwImage;
    
    
    public static void loadInitialImages() {
        
        bgImage = loadImage("tlo4.jpg");
        bgzwImage = loadImage("tlozw.jpg");
        
    }
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }    
}
