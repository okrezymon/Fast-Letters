
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JDialog;
//import java.util.TimerTask;

public class Zwierzeta extends JPanel implements ActionListener {
    
    JButton menub;
    Timer tm;
    Timer t;
    int x=60,  y=0, velY=2,y2=-250, y3=-500, y4=-750, y5=-1000, y6=-1250, y7=-1500, y8=-1750, y9=-2000, y10=-2250;
    //int c;
    public static boolean czywyswietlono = false;
    
    public Zwierzeta() {
        
        tm = new Timer(5, this);
        menub = new JButton("MENU");
        
        setLayout(null);
       
        add(menub);

        przyciski();
        Obrazy.loadInitialImages(); 
        
        
              
    }
    
    
   
    protected void paintComponent(Graphics gs){
        int a=1, b=1, c=1, d=1, e=1, f=1, h=1, j=1, k=1, l=1, m=1, n=1, o=1, p=1, r=1, s=1, t=1, u=1, w=1, a1=1, b1=1, c1=1, d1=1, e1=1, f1=1, g1=1;
        
        super.paintComponent(gs);
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgzwImage, 0, 0, null);
        
        if (Zwierzeta.czywyswietlono){
        //g.setColor(Color.RED);
        //g.fillRect(30,y,50,30);
            for(int i=2;i<18;i+=5){ 
                g.drawImage(Obrazy.letters[i], x*a*4, y, null);
                a++;
            };
   
            for (int i=3;i<13;i+=3){
                g.drawImage(Obrazy.letters[i], x*b*4, y2, null); 
                b++;
            };
            
            for (int i=1;i<11;i+=3){
                g.drawImage(Obrazy.letters[i], x*d*4, y3, null); 
                d++;
            };
            
            for (int i=14;i<24;i+=3){
                g.drawImage(Obrazy.letters[i], x*e*4, y4, null); 
                e++;
            };
            
             for (int i=24;i>17;i-=2){
                g.drawImage(Obrazy.letters[i], x*f*4, y5, null); 
                f++;
            };
            
            for (int i=4;i<17;i+=4){
                g.drawImage(Obrazy.letters[i], x*h*4, y6, null); 
                h++;
            };
            
             for (int i=3;i<13;i+=3){
                g.drawImage(Obrazy.letters[i], x*c*4, y7, null); 
                c++;
            };
            
            
            
            
            
            /*for(int i=1;i<11;i+=3){ DLA POZIOMU 2
                g.drawImage(Obrazy.letters[i], x*j*4, y, null);
                j++;
            };
   
            for (int i=2;i<18;i+=5){
                g.drawImage(Obrazy.letters[i], x*k*4, y2, null); 
                k++;
            };
            
            for (int i=4;i<17;i+=4){
                g.drawImage(Obrazy.letters[i], x*l*4, y3, null); 
                l++;
            };
            
            for (int i=0;i<16;i+=5){
                g.drawImage(Obrazy.letters[i], x*m*4, y4, null); 
                m++;
            };
            
             for (int i=14;i<24;i+=3){
                g.drawImage(Obrazy.letters[i], x*n*4, y5, null); 
                n++;
            };
            
            for (int i=25;i>12;i-=4){
                g.drawImage(Obrazy.letters[i], x*o*4, y6, null); 
                o++;
            };
            
             for (int i=18;i>5;i-=4){
                g.drawImage(Obrazy.letters[i], x*p*4, y7, null); 
                p++;
            };
            
             for (int i=3;i<13;i+=3){
                g.drawImage(Obrazy.letters[i], x*r*4, y8, null); 
                r++;
            };
            
             for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*s*4, y9, null); 
                s++;
            };*/
            
            
            
            
            /*for(int i=25;i>12;i-=4){ DLA POZIOMU 3
                g.drawImage(Obrazy.letters[i], x*t*4, y, null);
                t++;
            };
   
            for (int i=18;i>5;i-=4){
                g.drawImage(Obrazy.letters[i], x*u*4, y2, null); 
                u++;
            };
            
            for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*w*4, y3, null); 
                w++;
            };
            
            for (int i=2;i<18;i+=5){
                g.drawImage(Obrazy.letters[i], x*g1*4, y4, null); 
                g1++;
            };
            
            for (int i=0;i<16;i+=5){
                g.drawImage(Obrazy.letters[i], x*a1*4, y5, null); 
                a1++;
            };
            
             for (int i=1;i<11;i+=3){
                g.drawImage(Obrazy.letters[i], x*b1*4, y6, null); 
                b1++;
            };
            
            for (int i=25;i>12;i-=4){
                g.drawImage(Obrazy.letters[i], x*c1*4, y7, null); 
                c1++;
            };
            
             for (int i=25;i>9;i-=5){
                g.drawImage(Obrazy.letters[i], x*d1*4, y8, null); 
                d1++;
            };
            
             for (int i=1;i<11;i+=3){
                g.drawImage(Obrazy.letters[i], x*e1*4, y9, null); 
                e1++;
            };
            
             for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*f1*4, y10, null); 
                f1++;
            };*/
            
        }
        
        tm.start();
        
      
    };
    
    /*public int losujl(){
        Random rand = new Random();
        int c = rand.nextInt(26);
        return c;
    };*/
    
    
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
        y10=y10+ velY;
        repaint();}
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
            Zwierzeta.czywyswietlono = true;
            
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



