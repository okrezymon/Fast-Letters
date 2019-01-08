
package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Klasa Info dziedzicząca po klasie JPanel 
 * Wyświetla informacje o grze i instrukcję dla użytkownika
 * @author Olga Krezymon
 */

public class Info extends JPanel {
    
    /** Zdefiniowanie przycisku oraz napisu */
    JButton powrotmenu;
    JLabel instrukcja;
    
    /**
     * Konstruktor klasy Info
     * Dodaje napis i przycisk do panelu oraz wywołuje funkcję ładującą tło
     */
    
    public Info(){
        
        powrotmenu = new JButton(new ImageIcon("images/replay2.png"));
        instrukcja = new JLabel("Cos");
        
        setLayout(null);
       
        add(powrotmenu);
        add(instrukcja);
        
        // wywołanie funkcji odpowiadającej za odpowiednie ustawienie przycisków 
        przyciski();
        //wywolanie funkcji ładującej obraz tła
        Obrazy.loadInitialImages();
    }
    
    /**
     * Metoda odpowiedzialna za odrysowanie tła na panelu
     * @param gs 
     */
    
    protected void paintComponent(Graphics gs){
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgImage, 0, 0, null);
    }
    
    /**
     * Metoda odpowiedzialna za ustawienie przycisków i ich właściwości
     */
    
    protected void przyciski(){
        
        instrukcja.setText("<html> Przez 5 sekund wyświetli ci się na planszy słówko. Następnie zniknie i zaczną pojawiać się różne literki. Twoim zadaniem jest kliknięcie w nie w odpowiedniej kolejności. Nie możesz kliknąć dwa razy w tą samą literkę. <br> Jeżeli Ci się to uda, przechodzisz do następnego poziomu. Jeżeli nie, musisz niestety spróbować jeszcze raz. <br> Powodzenia! </html>");
        instrukcja.setForeground(Color.cyan);
        instrukcja.setBounds(200,100,1000,600);
        instrukcja.setFont(new Font("Courier New",Font.PLAIN, 40));
        
        powrotmenu.setBackground(Color.blue);
        powrotmenu.setBounds(950,800,250,120);
    }
}
