/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Wygrana extends JDialog{
    
    public static JButton dokat;
    
    public Wygrana(){
        
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setSize(500, 300); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        Panel gratulacje = new Panel(); 
        add(gratulacje);
     
        //timer();
        
        //setVisible(true);
        
        dokat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }
            
        });
       
    }
    public void timer(){
        javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
            
            setVisible(false);
            dispose();
            Zwierzeta.czy3poziomz=false;
            Cialo.czy3poziomc=false;
            Jedzenie.czy3poziomj=false;
            
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    public class Panel extends JPanel{
        
        public Panel(){
            JLabel grat = new JLabel("GRATULACJE");
            dokat = new JButton("Wybór kategorii");
            setSize(500, 300); 
            setLayout(null);
            
            grat.setBounds(100,50,400,100);
            grat.setFont(new Font("Courier New",Font.BOLD, 50));
            grat.setForeground(Color.yellow);
            
            dokat.setBounds(100,170,300,80);
            dokat.setBackground(Color.YELLOW);
            dokat.setFont(new Font("Comic Sans",Font.BOLD, 25));
            dokat.setForeground(Color.pink);
            
            setBackground(Color.pink);
            add(grat);
            add(dokat);
        }
    }
}
