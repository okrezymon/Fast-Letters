
package game;

/**
 * Fast Letters
 * Prosta gra edukacyjna ucząca angielskich słówek oraz ich literowania
 * @author Olga Krezymon
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.Timer;

public class Game {
    
    /**
     * Metoda uruchamia grę. Pobiera rozmiary ekranu, żeby następnie dopasować
     * rozmiar okna gry i je wyśrodkować 
     */
    
    public static void main(String[] args) {
        int gameWidth=1280;
        int gameHeight=1024;
        
        // pobranie rozmiaru ekranu
        int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        //wyśrodkowanie okna gry 
        int xCenter=(screenWidth-gameWidth)/2;
        int yCenter=(screenHeight-gameHeight)/2;
        
        //stworzenie obiektu typu Okno z parametrami obliczonymi powyżej
        Okno mojeokno=new Okno(gameWidth,gameHeight,xCenter,yCenter);
        
    }//koniec class main()
    
}//koniec class Game()
