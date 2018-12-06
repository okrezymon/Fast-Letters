
package game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Okno extends JFrame {
    JPanel poczatek=new JPanel();
    JPanel menu=new JPanel();
    JPanel kategoria=new JPanel();
    public JPanel cardPanel = new JPanel();
    public CardLayout cl = new CardLayout();
    public Container pane = this.getContentPane();
    
    
    public Okno(int width, int height, int x, int y){
        super();
        setSize(width, height); 
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setUndecorated(false);
        initGUI(width,height);
        Kategoria(width,height);
        Menu(width,height);
        //setVisible(true);
        cardPanel.setLayout(cl);
        cardPanel.add(poczatek,"POCZATEK");
        cardPanel.add(menu,"MENU"); //To co w cudzysłowie to jak możemy to potem zawołać 
        cardPanel.add(kategoria,"CHOOSE");
        pane.setLayout(new BorderLayout());
        pane.add(cardPanel,BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
        
    }
    
    public void initGUI(int width, int height){
        
        
        //JLabel n1=new JLabel("Fast Letters");
        
        Button gra=new Button("Graj");
        Button wyjdz=new Button("Wyjdz");
        /*poczatek.setLayout(new GridLayout(3,1));
        poczatek.add(n1);
        poczatek.add(gra);
        poczatek.add(wyjdz);
        this.add(poczatek);*/
        
        gra.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    graActionPerformed(evt);
                }
            });
        
        
        poczatek.setLayout(new FlowLayout(FlowLayout.CENTER,900,430));
        poczatek.setSize(width,height);
        
        wyjdz.setPreferredSize(new Dimension(300,150));
        //wyjdz.setBounds(1000,680,500,100);
        wyjdz.setBackground(Color.cyan);
        gra.setPreferredSize(new Dimension(300,150));
        gra.setBackground(Color.MAGENTA);
        poczatek.add(gra);
        poczatek.add(wyjdz);
        //poczatek.add(n1);
        //this.add(poczatek);
        wyjdz.addActionListener(new End());
        
        
    }
    
    class End implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
    private void graActionPerformed(java.awt.event.ActionEvent evt) {                                         
        cl.show(cardPanel,"CHOOSE");
    }    
    public void Kategoria(int width, int height){
        
       
        
        Button zwierzeta=new Button("Zwierzęta");
        Button jedzenie=new Button("Jedzenie");
        Button cialo=new Button("Części ciała");
        
        
        
        kategoria.setLayout(new FlowLayout(FlowLayout.CENTER,100,430));
        zwierzeta.setPreferredSize(new Dimension(300,150));
        zwierzeta.setBackground(Color.blue);
        jedzenie.setPreferredSize(new Dimension(300,150));
        jedzenie.setBackground(Color.ORANGE);
        cialo.setPreferredSize(new Dimension(300,150));
        cialo.setBackground(Color.GREEN);
        kategoria.add(zwierzeta);
        kategoria.add(jedzenie);
        kategoria.add(cialo);
        //this.add(kategoria);
        
        
    }
    
    
    public void Menu (int width, int height){
        
        
        
        JLabel n1=new JLabel("Co dalej?",JLabel.CENTER);
        Font f=new Font("Comic Sans", Font.BOLD, 30);
        n1.setFont(f);
        Button odnowa=new Button("Rozpocznij grę od nowa ");
        Button info=new Button("Instrukcja");
        
        menu.setLayout(new GridLayout(4,1));
        
        
        //setLayout(new FlowLayout(FlowLayout.CENTER,100,430));
        //odnowa.setPreferredSize(new Dimension(300,150));
        odnowa.setBackground(Color.blue);
        //wyjdz.setPreferredSize(new Dimension(300,150));
        //wyjdz.setBackground(Color.ORANGE);
        //info.setPreferredSize(new Dimension(300,150));
        info.setBackground(Color.GREEN);
        menu.add(n1);
        menu.add(odnowa);
        menu.add(info);
        //menu.add(wyjdz);
        //this.add(menu);
        //wyjdz.addActionListener(new End());
        
        
    }
    
}
