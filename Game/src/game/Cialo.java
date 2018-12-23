
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cialo extends JPanel{
    
    JButton menub;
    
    public Cialo(){
        
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

class Slowoc extends JDialog{
    
    public static String[] slowac;
    
    public Slowoc(){
        
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setSize(400, 200); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        Panel slowko = new Panel(); 
        add(slowko);
     
        timer();
        setVisible(true);
       
    }
    
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
            slowac = new String[3];
            slowac[0]="LEG";
            slowac[1]="ARM";
            slowac[2]="EYE";
            JLabel sl = new JLabel(slowac[losuj()]);
            setSize(400, 200); 
            setLayout(null);
            sl.setBounds(150,50,100,100);
            sl.setFont(new Font("Courier New",Font.BOLD, 50));
            sl.setForeground(Color.yellow);
            setBackground(Color.pink);
            add(sl);
        }
        
        public int losuj(){
 
            int zakres=slowac.length-1;
            int wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany; 
        }
    }
}
