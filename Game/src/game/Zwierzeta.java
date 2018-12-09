
package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalTime;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
//import java.util.TimerTask;

public class Zwierzeta extends JPanel {
    
    JButton menub;
    
    public Zwierzeta(){
        
        menub = new JButton("MENU");
        
        setLayout(null);
       
        add(menub);

        przyciski();
        Obrazy.loadInitialImages(); 
        
    }
   
    protected void paintComponent(Graphics gs){
        
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgzwImage, 0, 0, null);
    };
    
    protected void przyciski(){
        
        menub.setBackground(Color.pink);
        menub.setBounds(1000,850,200,80);
        menub.setFont(new Font("Comic Sans",Font.BOLD, 30));
        menub.setForeground(Color.YELLOW);
    }
  
}



