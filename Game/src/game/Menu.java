
package game;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu extends JPanel{
    
    public Menu(){
        
        JLabel n1=new JLabel("Co dalej?",JLabel.CENTER);
        Font f=new Font("Comic Sans", Font.BOLD, 30);
        n1.setFont(f);
        JButton odnowa=new JButton("Rozpocznij grę od nowa ");
        JButton info=new JButton("Instrukcja");
        JButton wyjdz=new JButton("Wyjdź");
        
        setLayout(null);
        
        
        
        odnowa.setBackground(Color.blue);
        
        info.setBackground(Color.GREEN);
        add(n1);
        add(odnowa);
        add(info);
        add(wyjdz);
        wyjdz.addActionListener(new End());
        
        //wyjdz.addActionListener(new End());
    }
    
     public class End implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}
