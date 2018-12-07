
package game;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Kategoria extends JPanel{
    
    public Kategoria(){
        
        JButton zwierzeta=new JButton(new ImageIcon("footprint.png"));
        JButton jedzenie=new JButton(new ImageIcon("food.png"));
        JButton cialo=new JButton(new ImageIcon("body.png"));
        
        Obrazy.loadInitialImages();
        
        setLayout(null);
        
        zwierzeta.setBackground(Color.blue);
        zwierzeta.setBounds(200,400,250,150);
        zwierzeta.setFont(new Font("Comic Sans",Font.BOLD, 20));
        
        jedzenie.setBackground(Color.ORANGE);
        jedzenie.setBounds(500,400,250,150);
        jedzenie.setFont(new Font("Comic Sans",Font.BOLD, 20));
        
        cialo.setBackground(Color.GREEN);
        cialo.setBounds(800,400,250,150); 
        cialo.setFont(new Font("Comic Sans",Font.BOLD, 20));
        
        add(zwierzeta);
        add(jedzenie);
        add(cialo);
        
    }
    
    protected void paintComponent(Graphics gs){
        Graphics2D g=(Graphics2D)gs;
        //Ustaw tryb lepszej jakoĹ›ci grafiki (wygĹ‚adzanie/antyaliasing)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Narysuj tĹ‚o
        g.drawImage(Obrazy.bgImage, 0, 0, null);
    }  
    
}
