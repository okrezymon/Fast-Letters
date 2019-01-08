
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


public class Przegrana extends JDialog{
    
    public static JButton dokat;
    
    public Przegrana(){
        
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setSize(500, 300); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        Panel koniec = new Panel(); 
        add(koniec);
     
        //timer();
        
        //setVisible(false);
        
        dokat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }
            
        });
        
       
    }
    /*public void timer(){
        javax.swing.Timer timer = new javax.swing.Timer(10000, (ActionEvent e) -> {
            
            setVisible(false);
            dispose();
            Zwierzeta.czy1poziomz=false;
            Zwierzeta.czy2poziomz=false;
            Zwierzeta.czy3poziomz=false;
            Cialo.czy1poziomc=false;
            Cialo.czy2poziomc=false;
            Cialo.czy3poziomc=false;
            Jedzenie.czy1poziomj=false;
            Jedzenie.czy2poziomj=false;
            Jedzenie.czy3poziomj=false;
            
        });
        timer.setRepeats(false);
        timer.start();
    }*/
    
    public class Panel extends JPanel{
        
        
        
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
