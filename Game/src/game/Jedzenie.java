
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


public class Jedzenie extends JPanel {
    
    JButton menub;
    
    public Jedzenie(){
        
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
class Slowoj extends JDialog{
    
    public static String[] slowaj;
    
    public Slowoj(){
        
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
            slowaj = new String[3];
            slowaj[0] = "MEAT";
            slowaj[1] = "MILK";
            slowaj[2] = "FRUIT";
            JLabel sl = new JLabel(slowaj[losuj()]);
            setSize(400, 200); 
            setLayout(null);
            sl.setBounds(140,50,200,100);
            sl.setFont(new Font("Courier New",Font.BOLD, 50));
            sl.setForeground(Color.yellow);
            setBackground(Color.pink);
            add(sl);
        }
        
        public int losuj(){
 
            int zakres=slowaj.length-1;
            int wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany; 
        }
    }
}
