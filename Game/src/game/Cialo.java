
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cialo extends JPanel implements ActionListener{
    
    JButton menub;
    Timer tm;
    Timer t;
    int x=60,  y=0, velY=2,y2=-250, y3=-500, y4=-750, y5=-1000, y6=-1250, y7=-1500, y8=-1750, y9=-2000, y10=-2250;
    
    public Cialo(){
        
        tm = new Timer(5, this);
        menub = new JButton("MENU");
        
        setLayout(null);
        
        add(menub);
        
        przyciski(); 
        Obrazy.loadInitialImages();
    }
    
    protected void paintComponent(Graphics gs){
        
        int a=1, b=1, c=1, d=1, e=1, f=1, h=1, j=1, k=1, l=1, m=1, n=1, o=1, p=1, r=1, s=1, t=1, u=1, w=1, a1=1, b1=1;
        super.paintComponent(gs);
        
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgzwImage, 0, 0, null);
        
        if (Zwierzeta.czywyswietlono){
            /*for(int i=9;i<16;i+=2){ 
                g.drawImage(Obrazy.letters[i], x*a*4, y, null);
                a++;
            };
   
            for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*b*4, y2, null); 
                b++;
            };
            
            for (int i=24;i>17;i-=2){
                g.drawImage(Obrazy.letters[i], x*c*4, y3, null); 
                c++;
            };
            
            for (int i=3;i<13;i+=3){
                g.drawImage(Obrazy.letters[i], x*d*4, y4, null); 
                d++;
            };
            
             for (int i=1;i<11;i+=3){
                g.drawImage(Obrazy.letters[i], x*e*4, y5, null); 
                e++;
            };*/
            
            
            
            
            /*for(int i=1;i<11;i+=3){ 
                g.drawImage(Obrazy.letters[i], x*f*4, y, null);
                f++;
            };
   
            for (int i=9;i<16;i+=2){
                g.drawImage(Obrazy.letters[i], x*h*4, y2, null); 
                h++;
            };
            
            for (int i=0;i<16;i+=5){
                g.drawImage(Obrazy.letters[i], x*j*4, y3, null); 
                j++;
            };
            
            for (int i=18;i>5;i-=4){
                g.drawImage(Obrazy.letters[i], x*k*4, y4, null); 
                k++;
            };
            
             for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*l*4, y5, null); 
                l++;
            };
            
            for (int i=3;i<13;i+=3){
                g.drawImage(Obrazy.letters[i], x*m*4, y6, null); 
                m++;
            };
            
            for (int i=2;i<18;i+=5){
                g.drawImage(Obrazy.letters[i], x*n*4, y7, null); 
                n++;
            };*/
            
            
            
            
            for(int i=2;i<18;i+=5){ 
                g.drawImage(Obrazy.letters[i], x*o*4, y, null);
                o++;
            };
   
            for (int i=18;i>5;i-=4){
                g.drawImage(Obrazy.letters[i], x*p*4, y2, null); 
                p++;
            };
            
            for (int i=1;i<11;i+=3){
                g.drawImage(Obrazy.letters[i], x*r*4, y3, null); 
                r++;
            };
            
            for (int i=14;i<24;i+=3){
                g.drawImage(Obrazy.letters[i], x*s*4, y4, null); 
                s++;
            };
            
             for (int i=25;i>9;i-=5){
                g.drawImage(Obrazy.letters[i], x*t*4, y5, null); 
                t++;
            };
            
            for (int i=24;i>17;i-=2){
                g.drawImage(Obrazy.letters[i], x*u*4, y6, null); 
                u++;
            };
            
            for (int i=18;i>5;i-=4){
                g.drawImage(Obrazy.letters[i], x*w*4, y7, null); 
                w++;
            };
            
            for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*a1*4, y8, null); 
                a1++;
            };
            
            for (int i=2;i<18;i+=5){
                g.drawImage(Obrazy.letters[i], x*b1*4, y9, null); 
                b1++;
            };
        }
        tm.start();
    };
    
    protected void przyciski(){
        
        menub.setBackground(Color.pink);
        menub.setBounds(1000,850,200,80);
        menub.setFont(new Font("Comic Sans",Font.BOLD, 30));
        menub.setForeground(Color.YELLOW);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (Zwierzeta.czywyswietlono){
        y = y + velY;
        y2= y2 + velY; 
        y3= y3 + velY; 
        y4= y4 + velY; 
        y5= y5 + velY; 
        y6= y6 + velY; 
        y7= y7 + velY; 
        y8= y8 + velY;
        y9= y9 + velY;
        repaint();}
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
            Zwierzeta.czywyswietlono = true;
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
