
package game;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu extends JPanel{
    
    JButton odnowa;
    JButton infob;
    JButton wyjdz;
    
    public Menu(){
        
        JLabel n5=new JLabel("Co dalej?");
        n5.setBounds(470,100,1200,100);
        n5.setFont(new Font("Courier New",Font.PLAIN, 70));
        n5.setForeground(Color.cyan);
        
        odnowa=new JButton(new ImageIcon("replay2.png"));
        infob=new JButton(new ImageIcon("info.png"));
        wyjdz=new JButton(new ImageIcon("exit.png"));
        
        Obrazy.loadInitialImages();
        
        setLayout(null);
        
        odnowa.setBackground(Color.blue);
        odnowa.setBounds(450,300,420,150);
        
        
        infob.setBackground(Color.blue);
        infob.setBounds(450,550,420,150);
        
        
        wyjdz.setBackground(Color.blue);
        wyjdz.setBounds(450,800,420,150);
        
        
        
        add(n5);
        add(odnowa);
        add(infob);
        add(wyjdz);
        wyjdz.addActionListener(new End());
        
        
    }
    
     public class End implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
     
     protected void paintComponent(Graphics gs){
        Graphics2D g=(Graphics2D)gs;
        //Ustaw tryb lepszej jakoĹ›ci grafiki (wygĹ‚adzanie/antyaliasing)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Narysuj tĹ‚o
        g.drawImage(Obrazy.bgImage, 0, 0, null);
    } 
}
