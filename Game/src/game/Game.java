
package game;

import java.awt.Toolkit;


public class Game {

    
    public static void main(String[] args) {
        int gameWidth=1280;
        int gameHeight=1024;
        
        int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        int xCenter=(screenWidth-gameWidth)/2;
        int yCenter=(screenHeight-gameHeight)/2;
        
        Okno mojeokno=new Okno(gameWidth,gameHeight,xCenter,yCenter);
    }
    
}