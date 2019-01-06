
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    
   boolean czyl, czye, czyg, czya, czyr, czym, czye1, czyy, czye2, czyh, czye3, czya1, czyd, czyh1, czya2, czyi, czyr1, czyn, czyo, czys, czye4, czys1, czyt, czyo1, czym1, czya3, czyc, czyh2, czym2, czyo2, czyu, czyt2, czyh3, czyc1, czyh4, czye5, czye6, czyk2, czys2;
    
    int xc, yc;
    static int wyl;
    
    public Cialo(){
        
        tm = new Timer(20, this);
        menub = new JButton("MENU");
        
        setLayout(null);
        
        add(menub);
        
        przyciski(); 
        Obrazy.loadInitialImages();
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
            xc=e.getX();
            yc=e.getY();
            //System.out.println(xc+","+yc);//these co-ords are relative to the component
            }
        });
    }
    
    protected void paintComponent(Graphics gs){
        
        int a=1, b=1, c=1, d=1, e=1, f=1, h=1, j=1, k=1, l=1, m=1, n=1, o=1, p=1, r=1, s=1, t=1, u=1, w=1, a1=1, b1=1, b2=1, c1=1;
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
            
            for (int i=21;i>14;i-=2){
                g.drawImage(Obrazy.letters[i], x*b2*4, y3, null); 
                b2++;
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
            
            for (int i=21;i>14;i-=2){
                g.drawImage(Obrazy.letters[i], x*c1*4, y6, null); 
                c1++;
            };
            
            for (int i=24;i>17;i-=2){
                g.drawImage(Obrazy.letters[i], x*u*4, y7, null); 
                u++;
            };
            
            for (int i=18;i>5;i-=4){
                g.drawImage(Obrazy.letters[i], x*w*4, y8, null); 
                w++;
            };
            
            for (int i=0;i<13;i+=4){
                g.drawImage(Obrazy.letters[i], x*a1*4, y9, null); 
                a1++;
            };
            
            for (int i=2;i<18;i+=5){
                g.drawImage(Obrazy.letters[i], x*b1*4, y10, null); 
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
        y10=y10+velY;
        repaint();
        /*if(wyl==0){ POZIOM 1 WSZYSTKO SIE ZGADZA
                if(480<xc && xc<580 && y<yc && yc<y+94){
                    System.out.println("l");
                    czyl=true;
                }
                if(480<xc && xc<580 && y2<yc && yc<y2+94 && czyl==true){
                    
                    System.out.println("e");
                    czye=true;
                }
                if(480<xc && xc<580 && y4<yc && yc<y4+94 && czyl==true && czye==true){
                    
                    System.out.println("g");
                    czyg=true;
                }
                
                if(czyl==true && czye==true && czyg==true){
                    System.out.println("OK");
                }
            
            }   
            
            if(wyl==1){
                if(240<xc && xc<340 && y2<yc && yc<y2+94){
                    System.out.println("a");
                    czya=true;
                }
                if(720<xc && xc<820 && y3<yc && yc<y3+94 && czya==true ){
                    
                    System.out.println("r");
                    czyr=true;
                }
                if(960<xc && xc<1060 && y5<yc && yc<y5+94 && czya==true && czyr==true){
                    
                    System.out.println("m");
                    czym=true;
                }
                
                if(czya==true && czyr==true && czym==true ){
                    System.out.println("OK");
                }
            }
            
            if(wyl==2){
                if(480<xc && xc<580 && y2<yc && yc<y2+94){
                    System.out.println("e");
                    czye1=true;
                }
                if(240<xc && xc<340 && y4<yc && yc<y4+94 && czye1==true){
                    
                    System.out.println("y");
                    czyy=true;
                }
                if(480<xc && xc<580 && y6<yc && yc<y6+94 && czye1==true && czyy==true){
                    
                    System.out.println("e");
                    czye2=true;
                }
                
                if(czye1==true && czyy==true && czye2==true ){
                    System.out.println("OK");
                }
            }*/
            
        
            /*if(wyl==0){ POZIOM 2 SPRAWDZONE WSZYSTKO DZIALA 
                if(720<xc && xc<820 && y<yc && yc<y+94){
                    System.out.println("h");
                    czyh=true;
                }
                if(480<xc && xc<580 && y<yc && yc<y+94 && czyh==true){
                    
                    System.out.println("e");
                    czye3=true;
                }
                if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyh==true && czye3==true){
                    
                    System.out.println("a");
                    czya1=true;
                }
                if(240<xc && xc<340 && y6<yc && yc<y6+94 && czyh==true && czye3==true && czya1==true){
                    
                    System.out.println("d");
                    czyd=true;
                }
                
                if(czyh==true && czye3==true && czya1==true && czyd==true){
                    System.out.println("OK");
                }
            
            }   
            
            if(wyl==1){
                if(720<xc && xc<820 && y<yc && yc<y+94){
                    System.out.println("h");
                    czyh1=true;
                }
                if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyh1==true ){
                    
                    System.out.println("a");
                    czya2=true;
                }
                if(720<xc && xc<820 && y5<yc && yc<y5+94 && czyh1==true && czya2==true){
                    
                    System.out.println("i");
                    czyi=true;
                }
                if(960<xc && xc<1060 && y7<yc && yc<y7+94 && czyh1==true && czya2==true && czyi==true){
                    
                    System.out.println("r");
                    czyr1=true;
                }
                
                if(czyh1==true && czya2==true && czyi==true && czyr1==true ){
                    System.out.println("OK");
                }
            }
            
            if(wyl==2){
                if(720<xc && xc<820 && y2<yc && yc<y2+94){
                    System.out.println("n");
                    czyn=true;
                }
                if(480<xc && xc<580 && y4<yc && yc<y4+94 && czyn==true){
                    
                    System.out.println("o");
                    czyo=true;
                }
                if(240<xc && xc<340 && y4<yc && yc<y4+94 && czyn==true && czyo==true){
                    
                    System.out.println("s");
                    czys=true;
                }
                if(480<xc && xc<580 && y5<yc && yc<y5+94 && czyn==true && czyo==true && czys==true){
                    
                    System.out.println("e");
                    czye4=true;
                }
                
                if(czyn==true && czyo==true && czys==true && czye4==true){
                    System.out.println("OK");
                }
            }*/
            
            
            if(wyl==0){ 
                if(240<xc && xc<340 && y2<yc && yc<y2+94){
                    System.out.println("s");
                    czys1=true;
                }
                if(480<xc && xc<580 && y6<yc && yc<y6+94 && czys1==true){
                    
                    System.out.println("t");
                    czyt=true;
                }
                if(480<xc && xc<580 && y8<yc && yc<y8+94 && czys1==true && czyt==true){
                    
                    System.out.println("o");
                    czyo1=true;
                }
                if(960<xc && xc<1060 && y9<yc && yc<y9+94 && czys1==true && czyt==true && czyo1==true){
                    
                    System.out.println("m");
                    czym1=true;
                }
                if(240<xc && xc<340 && y9<yc && yc<y9+94 && czys1==true && czyt==true && czyo1==true && czym1==true){
                    
                    System.out.println("a");
                    czya3=true;
                }
                if(240<xc && xc<340 && y10<yc && yc<y10+94 && czys1==true && czyt==true && czyo1==true && czym1==true && czya3==true){
                    
                    System.out.println("c");
                    czyc=true;
                }
                if(480<xc && xc<580 && y10<yc && yc<y10+94 && czys1==true && czyt==true && czyo1==true && czym1==true && czya3==true && czyc==true){
                    
                    System.out.println("h");
                    czyh2=true;
                }
                
                if(czyt==true && czyo1==true && czym1==true && czya3==true && czyc==true && czyh2==true){
                    System.out.println("OK");
                }
            
            }   
            
            if(wyl==1){
                if(720<xc && xc<820 && y<yc && yc<y+94){
                    System.out.println("m");
                    czym2=true;
                }
                if(240<xc && xc<340 && y4<yc && yc<y4+94 && czym2==true ){
                    
                    System.out.println("o");
                    czyo2=true;
                }
                if(480<xc && xc<580 && y5<yc && yc<y5+94 && czym2==true && czyo2==true){
                    
                    System.out.println("u");
                    czyu=true;
                }
                if(480<xc && xc<580 && y6<yc && yc<y6+94 && czym2==true && czyo2==true && czyu==true){
                    
                    System.out.println("t");
                    czyt2=true;
                }
                
                if(480<xc && xc<580 && y10<yc && yc<y10+94 && czym2==true && czyo2==true && czyu==true && czyt2==true){
                    
                    System.out.println("h");
                    czyh3=true;
                }
                
                if(czym2==true && czyo2==true && czyu==true && czyt2==true && czyh3==true){
                    System.out.println("OK ");
                }
            }
            
            if(wyl==2){
                if(240<xc && xc<340 && y<yc && yc<y+94){
                    System.out.println("c");
                    czyc1=true;
                }
                if(480<xc && xc<580 && y<yc && yc<y+94 && czyc1==true){
                    
                    System.out.println("h");
                    czyh4=true;
                }
                if(480<xc && xc<580 && y3<yc && yc<y3+94 && czyc1==true && czyh4==true){
                    
                    System.out.println("e");
                    czye5=true;
                }
                if(480<xc && xc<580 && y3<yc && yc<y3+94 && czyc1==true && czyh4==true && czye5==true){
                    
                    System.out.println("e");
                    czye6=true;
                }
                if(960<xc && xc<1060 && y5<yc && yc<y5+94 && czyc1==true && czyh4==true && czye5==true && czye6==true){
                    
                    System.out.println("k");
                    czyk2=true;
                }
                if(960<xc && xc<1060 && y6<yc && yc<y6+94 && czyc1==true && czyh4==true && czye5==true && czye6==true && czyk2==true){
                    
                    System.out.println("s");
                    czys2=true;
                }
                
                if(czyc1==true && czyh4==true && czye5==true && czye6==true && czyk2==true && czys2==true){
                    System.out.println("OK");
                }
            }
        }
    }
}

class Slowoc extends JDialog{
    
    public static String[] slowac1, slowac2, slowac3;
    
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
            slowac1 = new String[3];
            slowac2 = new String[3];
            slowac3 = new String[3];
            
            slowac1[0]="LEG";
            slowac1[1]="ARM";
            slowac1[2]="EYE";
            
            slowac2[0]="HEAD";
            slowac2[1]="HAIR";
            slowac2[2]="NOSE";
            
            slowac3[0]="STOMACH";
            slowac3[1]="MOUTH";
            slowac3[2]="CHEEKS";
            
            Cialo.wyl=losuj();
            JLabel sl = new JLabel(slowac1[Cialo.wyl]);
            setSize(400, 200); 
            setLayout(null);
            sl.setBounds(150,50,100,100);
            sl.setFont(new Font("Courier New",Font.BOLD, 50));
            sl.setForeground(Color.yellow);
            setBackground(Color.pink);
            add(sl);
        }
        
        public int losuj(){
 
            int zakres=slowac1.length-1;
            int wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany; 
        }
    }
}
