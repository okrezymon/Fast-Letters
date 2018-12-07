
package game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Okno extends JFrame {
    
    InitGUI poczatek=new InitGUI();
    Menu menu=new Menu();
    Kategoria kategoria=new Kategoria();
    
    JPanel cardPanel;
    CardLayout cl;

    
    
    
    public Okno(int width, int height, int x, int y){
        super();
        setSize(width, height); 
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setUndecorated(false);
        
        setVisible(true);
        panele();
       
        
    }
    public void panele(){
        cardPanel=new JPanel(new CardLayout());
        getContentPane().add(cardPanel);
        cardPanel.add(poczatek,"POCZATEK");//To co w cudzysłowie to jak możemy to potem zawołać 
        cardPanel.add(kategoria,"CHOOSE");
        cardPanel.add(menu,"MENU");
        cl=(CardLayout)cardPanel.getLayout();
        cl.show(cardPanel,"POCZATEK");
        
        
        
        
        poczatek.gra.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"CHOOSE");
            }
            
        
        });
        
    }
   
    
    
}
