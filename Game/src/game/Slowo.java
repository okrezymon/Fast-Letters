
package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Slowo extends JDialog{
    
    
    
    public Slowo(){
        
        setModalityType(ModalityType.APPLICATION_MODAL);
        setSize(400, 200); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        Panel slowko = new Panel(); 
        add(slowko);
        
        
        
        
        
        
        
        
        
        
        
        //sl.setBounds(600,600,100,100);
        
        
        
        
        
        timer();
        setVisible(true);
        
        //slowko.setBackground(Color.red );
    }
    
    /*protected void paintComponent(Graphics gs){
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgImage, 0, 0, null);
    };*/
    
    public void timer(){
        Timer timer = new Timer(5000, (ActionEvent e) -> {
            setVisible(false);
            dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    public class Panel extends JPanel{
        
        public Panel(){
            JLabel sl = new JLabel("CAT");
            setSize(400, 200); 
            setLayout(null);
            sl.setBounds(150,50,100,100);
            sl.setFont(new Font("Courier New",Font.BOLD, 50));
            sl.setForeground(Color.yellow);
            setBackground(Color.pink);
            add(sl);
        }
    }
}
