
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.time.LocalTime;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import javax.swing.JDialog;
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

class Slowoz extends JDialog{
    
    public static String[] slowaz;
    
    public Slowoz(){
        
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
        javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
            setVisible(false);
            dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    
    
    public class Panel extends JPanel{
        
        public Panel(){
            slowaz= new String[3];
            slowaz[0]="CAT";
            slowaz[1]="DOG";
            slowaz[2]="COW";
            //losuj();
            JLabel sl = new JLabel(slowaz[losuj()]);
            setSize(400, 200); 
            setLayout(null);
            sl.setBounds(150,50,100,100);
            sl.setFont(new Font("Courier New",Font.BOLD, 50));
            sl.setForeground(Color.yellow);
            setBackground(Color.pink);
            add(sl);
        }
        
        public int losuj(){
 
            int zakres=slowaz.length-1;
            int wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany; 
        }
    }
}



