
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
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;

public class Okno extends JFrame {
    
    InitGUI poczatek=new InitGUI();
    Menu menu=new Menu();
    Kategoria kategoria=new Kategoria();
    Zwierzeta zwierzeta=new Zwierzeta();
    Jedzenie jedzenie=new Jedzenie();
    Cialo cialo=new Cialo();
    Info info=new Info();
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
        cardPanel.add(poczatek,"POCZATEK");
        cardPanel.add(kategoria,"WYBIERZ");
        cardPanel.add(zwierzeta,"ZWIERZETA");
        cardPanel.add(jedzenie,"JEDZENIE");
        cardPanel.add(cialo,"CIALO");
        cardPanel.add(menu,"MENU");
        cardPanel.add(info,"INFO");
        
        cl=(CardLayout)cardPanel.getLayout();
        cl.show(cardPanel,"WYBIERZ");
        
        poczatek.gra.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"WYBIERZ");
            }
        });
        
        kategoria.zwierzetab.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"ZWIERZETA");
                Slowo slowo = new Slowo();
            }
            
        });
        
        kategoria.jedzenieb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"JEDZENIE");
            }
            
        });
        
        kategoria.cialob.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"CIALO");
            }
            
        });
        
        zwierzeta.menub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"MENU");
            }
            
        });
        
        cialo.menub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"MENU");
            }
            
        });
        
        jedzenie.menub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"MENU");
            }
            
        });
        
        menu.odnowa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"WYBIERZ");
            }
            
        });
        
        menu.infob.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"INFO");
            }
            
        });
        
        info.powrotmenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cardPanel,"MENU");
            }
            
        });
    }   
}
