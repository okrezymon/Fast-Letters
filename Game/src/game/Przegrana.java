
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Klasa Przegrana dziedzicząca po JDialog. Wyświetla okno dialogowe, gdy 
 * użytkownik przegra grę. 
 * @author Olga Krezymon
 */

public class Przegrana extends JDialog{
    
    public static JButton dokat;
    
    /**
     * Konstruktor klasy Przegrana
     * Ustawia podstawowe parametry okna, wywołuje obiekt typu Panel, który
     * jest do niego dodany oraz wykonuje obsługę zdarzenia po wciśnięciu 
     * przycisku
     */
    
    public Przegrana(){
        
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setSize(500, 300); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        //stworzenie Panelu koniec, i dodanie go do okna
        Panel koniec = new Panel(); 
        add(koniec);
     
        //obsługa zdarzenia wciśnięcia przycisku dokat
        dokat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }
            
        });
        
    }
    
    /**
    * Klasa Panel dziedzicząca po JPanel. Dodaje napis oraz przycisk oraz ustala
    * jego parametry.
    * @author Olga Krezymon
    */
    
    public class Panel extends JPanel{
        
        /**
        * Konstruktor klasy JPanel
        * Definiuje przycisk przekierowujący do wyboru kategorii oraz napis i 
        * określa ich właściwości
        */
        
        public Panel(){
            
            JLabel kon = new JLabel("PRZEGRAŁEŚ");
            dokat = new JButton("Wybór kategorii");
            
            setSize(500, 300); 
            setLayout(null);
            
            kon.setBounds(100,50,400,100);
            kon.setFont(new Font("Courier New",Font.BOLD, 50));
            kon.setForeground(Color.yellow);
            
            dokat.setBounds(100,170,300,80);
            dokat.setBackground(Color.YELLOW);
            dokat.setFont(new Font("Comic Sans",Font.BOLD, 25));
            dokat.setForeground(Color.pink);
            
            setBackground(Color.pink);
            
            add(kon);
            add(dokat);
        }
    }
    
    
}
