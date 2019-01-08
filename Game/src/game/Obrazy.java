
package game;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Klasa Obrazy. Zdefiniowane zmienne obrazów tła oraz zmienne tablicowe przechowujące
 * obrazy liter
 * @author Olga Krezymon
 */

public class Obrazy {
    
    /** Obraz tła */
    public static Image bgImage;
    
    /** Obraz tła */
    public static Image bgzwImage;
    
    /** Tablica liter*/
    public static Image[] letters;
    
    /**
     * Metoda ładująca początkowe zasoby gry 
     */
    
    public static void loadInitialImages() {
        
        //załadowanie obrazów tła
        bgImage = loadImage("images/tlo4.jpg");
        bgzwImage = loadImage("images/tlozw.jpg");
        
        //zdefiniowanie tablicy obrazów 
        letters = new Image[26];
        
        //załadowanie obrazów do poszczególnych komórek w tablicy 
        letters[0]=loadImage("images/a.png");
        letters[1]=loadImage("images/b.png");
        letters[2]=loadImage("images/c.png");
        letters[3]=loadImage("images/d.png");
        letters[4]=loadImage("images/e.png");
        letters[5]=loadImage("images/f.png");
        letters[6]=loadImage("images/g.png");
        letters[7]=loadImage("images/h.png");
        letters[8]=loadImage("images/i.png");
        letters[9]=loadImage("images/j.png");
        letters[10]=loadImage("images/k.png");
        letters[11]=loadImage("images/l.png");
        letters[12]=loadImage("images/m.png");
        letters[13]=loadImage("images/n.png");
        letters[14]=loadImage("images/o.png");
        letters[15]=loadImage("images/p.png");
        letters[16]=loadImage("images/q.png");
        letters[17]=loadImage("images/r.png");
        letters[18]=loadImage("images/s.png");
        letters[19]=loadImage("images/t.png");
        letters[20]=loadImage("images/u.png");
        letters[21]=loadImage("images/v.png");
        letters[22]=loadImage("images/w.png");
        letters[23]=loadImage("images/x.png");
        letters[24]=loadImage("images/y.png");
        letters[25]=loadImage("images/z.png");
       
        
        
    }
    
    /**
     * Metoda pobierania obiektu klasy Image na podstawie ścieżki
     * dostepu podanej jako String
     */
    
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }    
}
