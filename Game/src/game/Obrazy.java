
package game;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Obrazy {
    
    public static Image bgImage;
    
    public static Image bgzwImage;
    
    public static Image[] letters;
    
    
    public static void loadInitialImages() {
        
        bgImage = loadImage("images/tlo4.jpg");
        bgzwImage = loadImage("images/tlozw.jpg");
        
        letters = new Image[26];
        letters[0]=loadImage("images/a.jpg");
        letters[1]=loadImage("images/b.jpg");
        letters[2]=loadImage("images/c.jpg");
        letters[3]=loadImage("images/d.jpg");
        letters[4]=loadImage("images/e.jpg");
        letters[5]=loadImage("images/f.jpg");
        letters[6]=loadImage("images/g.jpg");
        letters[7]=loadImage("images/h.jpg");
        letters[8]=loadImage("images/i.jpg");
        letters[9]=loadImage("images/j.jpg");
        letters[10]=loadImage("images/k.jpg");
        letters[11]=loadImage("images/l.jpg");
        letters[12]=loadImage("images/m.jpg");
        letters[13]=loadImage("images/n.jpg");
        letters[14]=loadImage("images/o.jpg");
        letters[15]=loadImage("images/p.jpg");
        letters[16]=loadImage("images/q.jpg");
        letters[17]=loadImage("images/r.jpg");
        letters[18]=loadImage("images/s.jpg");
        letters[19]=loadImage("images/t.jpg");
        letters[20]=loadImage("images/u.jpg");
        letters[21]=loadImage("images/v.jpg");
        letters[22]=loadImage("images/w.jpg");
        letters[23]=loadImage("images/x.jpg");
        letters[24]=loadImage("images/y.jpg");
        letters[25]=loadImage("images/z.jpg");
       
        
        
    }
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }    
}
